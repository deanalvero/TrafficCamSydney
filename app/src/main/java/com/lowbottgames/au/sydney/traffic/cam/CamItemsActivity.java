package com.lowbottgames.au.sydney.traffic.cam;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.lowbottgames.au.sydney.traffic.cam.adapter.CamItemsRVAdapter;
import com.lowbottgames.au.sydney.traffic.cam.domain.CamItem;
import com.lowbottgames.au.sydney.traffic.cam.domain.PlaceContent;
import com.lowbottgames.au.sydney.traffic.cam.domain.PlaceItem;
import com.squareup.picasso.Picasso;

public class CamItemsActivity extends AppCompatActivity {

    private static final String KEY_PLACE_ITEM = "KEY_PLACE_ITEM";

    private CamItemsRVAdapter camItemsRVAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private PlaceItem placeItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_items);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int placeItemIndex = 0;

        Intent intent = getIntent();
        if (intent != null) {
            placeItemIndex = intent.getIntExtra(KEY_PLACE_ITEM, 0);
        }

        placeItem = PlaceContent.ITEMS.get(placeItemIndex);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(placeItem.placeName);
        }


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        camItemsRVAdapter = new CamItemsRVAdapter();
        camItemsRVAdapter.setItems(placeItem.camItem);
        camItemsRVAdapter.setOnCamItemsRVAdapterListener(new CamItemsRVAdapter.OnCamItemsRVAdapterListener() {
            @Override
            public void onSelectCamItem(int position, CamItem camItem) {
                startActivity(CamItemActivity.newIntent(CamItemsActivity.this, camItem));
            }
        });

        Configuration configuration = getResources().getConfiguration();
        if (configuration != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }

        recyclerView.setAdapter(camItemsRVAdapter);
        recyclerView.setHasFixedSize(true);


        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);

                    invalidateImages(placeItem);

                    if (camItemsRVAdapter != null) {
                        camItemsRVAdapter.notifyDataSetChanged();
                    }
                }
            }
        });

    }

    private void invalidateImages(final PlaceItem placeItem) {
        if (placeItem != null) {
            for (CamItem camItem: placeItem.camItem) {
                Picasso.get().invalidate(TCSHelper.getImageURLString(camItem.camID));
            }
        }
    }

    public static Intent newIntent(Context context, int index) {
        Intent intent = new Intent(context, CamItemsActivity.class);
        intent.putExtra(KEY_PLACE_ITEM, index);
        return intent;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }

}

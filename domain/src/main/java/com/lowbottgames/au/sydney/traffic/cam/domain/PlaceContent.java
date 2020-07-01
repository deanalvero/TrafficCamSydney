package com.lowbottgames.au.sydney.traffic.cam.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaceContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<PlaceItem> ITEMS;

    static {
        List<PlaceItem> list = new ArrayList<>();


        list.add(new PlaceItem( "Inner Sydney", new CamItem[] {
                new CamItem("alisonrd_randwick", "Alison Road", "Randwick", "Alison Road at Darley Street looking north-west towards Anzac Parade"),
                new CamItem("anzacbr", "Anzac Bridge", "", "Intersection of Victoria Road and Anzac Bridge looking east towards the Sydney CBD"),
                new CamItem("anzacpde", "Anzac Parade", "Moore Park", "Corner of Anzac Parade and Cleveland Street looking south towards Randwick"),
                new CamItem("citywestlink", "City West Link", "", "City West Link at Lilyfield looking east towards Victoria Road intersection"),
                new CamItem("easterndist", "Eastern Distributor", "", "Southern end of the Eastern Distributor tunnel near the Link Road on-ramp looking north towards Sydney"),

                new CamItem("foreshore_banksmeadow", "Foreshore Road", "Banksmeadow", "Foreshore Road at Botany Road looking west towards Mascot"),

                new CamItem("ghd_airport", "General Holmes Drive", "Botany", "General Holmes Drive at the east end of the Airport Tunnel looking east towards Botany"),
                new CamItem("georgest", "George Street", "Railway Square", "Railway Square, George Street looking north towards Sydney CBD"),
                new CamItem("gladesvillebr", "Gladesville Bridge", "Drummoyne", "Gladesville Bridge looking west towards Gladesville"),

                new CamItem("homebushbay_homebush", "Homebush Bay Drive", "Homebush", "Homebush Bay Drive at Underwood Road looking north-east towards Ryde"),

                new CamItem("humehwy_ashfield", "Hume Highway", "Ashfield", "Corner of Hume Highway and Frederick Street looking west towards Strathfield"),
                new CamItem("humehwy_strathfield", "Hume Highway", "Strathfield", "Corner of Hume Highway and Roberts Road looking west towards Yagoona"),
                new CamItem("knggrd_beverlyhills", "King Georges Road", "Beverly Hills", "Corner of King Georges Road and Stoney Creek Road looking north towards Beverly Hills"),
                new CamItem("m4_olympic", "M4 Western Motorway", "Olympic Park", "M4 Western Motorway at Sydney Olympic Park looking east towards Strathfield"),

                new CamItem("m5_kingsgrove", "M5", "Kingsgrove", "M5 at Kingsgrove Road looking west towards Beverly Hills"),

                new CamItem("m5east", "M5 East", "Beverly Hills", "M5 East at the King Georges Road on ramp looking west towards Riverwood"),
                new CamItem("m5_arncliffe", "Marsh Street", "Arncliffe", "Marsh Street at West Botany Street looking east towards M5 East on-ramp"),
                new CamItem("parra_ashfield", "Parramatta Road", "Ashfield", "Parramatta Road at Liverpool Road looking south-east towards Sydney"),
                new CamItem("parrard_leichhardt", "Parramatta Road", "Leichhardt", "Parramatta Road at Elswick Street looking west towards Ashfield"),
                new CamItem("parrard_silverwater", "Parramatta Road", "Silverwater", "Parramatta Road at Silverwater Road looking west towards Parramatta"),
                new CamItem("parrard_strathfield", "Parramatta Road", "Strathfield", "Parramatta Road at Leicester Avenue looking east towards Burwood"),
                new CamItem("princes_blakehurst", "Princes Highway", "Blakehurst", "Princes Highway at the King Georges Road intersection looking south towards Sutherland"),
                new CamItem("princes_kogarah", "Princes Highway", "Kogarah", "Princes Highway at President Avenue looking south towards Ramsgate"),
                new CamItem("princes_stpeters", "Princes Highway", "St Peters", "Princes Highway at the Canal Road intersection looking north towards Sydney"),
                new CamItem("scd_eastlakes", "Southern Cross Drive", "Eastlakes", "Southern Cross Drive at Wentworth Avenue looking south towards Mascot"),
                new CamItem("sed_bondijunction", "Syd Einfeld Drive", "Bondi Junction", "Syd Einfeld Drive looking west towards Sydney CBD"),
                new CamItem("harbourbridge", "Sydney Harbour Bridge", "", "Sydney Harbour Bridge deck looking south towards the Sydney CBD"),
                new CamItem("grandpde_bls", "The Grand Parade", "Brighton-Le-Sands", "The Grand Parade at Bay Street looking north towards Sydney Airport"),
                new CamItem("williamst", "William Street", "East Sydney", "Corner of William Street and College Street near Hyde Park looking east towards Kings Cross"),

                new CamItem("yorkst_sydney", "York Street", "Sydney", "York Street at Margaret Street looking north towards Sydney Harbour Bridge"),

        }
        ));


        list.add(new PlaceItem( "Sydney North", new CamItem[] {
                new CamItem("burntbrdg_seaforth", "Burnt Bridge Creek", "Balgowlah", "Burnt Bridge Creek at Condamine Street looking north towards Dee Why"),

                new CamItem("beecroftrd_epping", "Carlingford Road", "Epping", "Carlingford Road at Beecroft Road looking west towards Carlingford"),
                new CamItem("cumberlandhwy_carlingford", "Cumberland Highway", "Carlingford", "Cumberland Highway at Marsden Road looking north towards Beecroft"),
                new CamItem("eppingrd_lanecove", "Epping Road", "Lane Cove", "Epping Road at Centennial Avenue looking west towards Lane Cove"),
                new CamItem("eppingrd_macquariepark", "Epping Road", "Macquarie Park", "Epping Road at Balaclava Road looking west towards Epping"),
                new CamItem("falconst_crowsnest", "Falcon Street", "Crows Nest", "Corner of Falcon Street and the Pacific Highway looking East towards the Warringah Freeway"),
                new CamItem("gorehillfwy_artarmon", "Gore Hill Freeway", "Artarmon", "Gore Hill Freeway at Artarmon looking south towards Sydney Harbour Bridge"),
                new CamItem("m2_pennanthills", "M2", "Pennant Hills", "M2 at Pennant Hills Road looking west towards Baulkham Hills"),
                new CamItem("m2_ryde", "M2", "Ryde", "M2 at the Lane Cove Road exit looking west towards Epping"),
                new CamItem("manlyrd", "Manly Road", "Seaforth", "Corner of Manly Road and Battle Boulevard near The Spit Bridge, looking north towards Manly"),
                new CamItem("militaryrd_neutralbay", "Military Road", "Neutral Bay", "Military Road at Wycombe Road looking west towards the Warringah Freeway"),
                new CamItem("pacific_chats", "Pacific Highway", "Chatswood", "Corner of the Pacific Highway and Centennial Avenue near Chatswood Park, looking south towards Sydney"),

                new CamItem("pennanthills_beecroft", "Pennant Hills Road", "Beecroft", "Pennant Hills Road at Beecroft Road looking east towards Pennant Hills"),

                new CamItem("pennanthillsrd_thornleigh", "Pennant Hills Road", "Thornleigh", "Pennant Hills Road at The Comenarra Parkway looking south towards Carlingford"),
                new CamItem("pittwaterrd_narrabeen", "Pittwater Road", "Narrabeen", "Pittwater Road at Wakehurst Parkway looking north towards Mona Vale"),
                new CamItem("rydebridge", "Ryde Bridge", "Ryde", "Church Street crossing Ryde Bridge looking north towards Ryde"),
                new CamItem("pacific_pymble", "Ryde Road", "Pymble", "Ryde Road at Pacific Highway looking south-west towards Ryd"),
                new CamItem("stewartst_eastwood", "Stewart Street", "Eastwood", "Corner of Stewart Street and Marsden Road looking west towards Parramatta"),
                new CamItem("victoriard_gladesville", "Victoria Road", "Gladesville", "Victoria Road at Pittwater Road looking north-west towards Ryde"),
                new CamItem("warringahfwy", "Warringah Freeway", "North Sydney", "The Warringah Freeway, approaching the Sydney Harbour Tunnel looking south towards the city"),
                new CamItem("warringahrd_forestville", "Warringah Road", "Forestville", "Warringah Road at Healey Way looking east towards Frenchs Forest"),
                new CamItem("warringahrd_frenchsforest", "Warringah Road", "Frenchs Forest", "Warringah Road at Forest Way looking west towards Forestville"),

        }
        ));

        list.add(new PlaceItem( "Sydney West", new CamItem[] {
                new CamItem("churchst_parra", "Church Street", "Parramatta", "Corner of Church Street and Victoria Road looking north towards Northmead"),
                new CamItem("cumberlandhwy_merrylands", "Cumberland Highway", "Merrylands", "Cumberland Highway at Merrylands Road looking north towards the M4 Western Motorway"),
                new CamItem("greatwesternhwy_hazelbrook", "Great Western Highway", "Hazelbrook", "Great Western Highway at Oaklands Road looking east towards Sydney"),
                new CamItem("jrd_rosehill", "James Ruse Drive", "Rosehill", "James Ruse Drive at Grand Avenue looking north towards Rydalmere"),
                new CamItem("m4_auburn", "M4 Western Motorway", "Auburn", "M4 Western Motorway at Auburn looking west towards St Marys"),
                new CamItem("m4_mayshill", "M4 Western Motorway", "Mays Hill", "M4 Western Motorway at Cumberland Highway looking east towards Sydney"),
                new CamItem("m4_minchinbury", "M4 Western Motorway", "Minchinbury", "M4 Western Motorway at Wallgrove Road looking east towards Eastern Creek"),
                new CamItem("m4_prospect", "M4 Western Motorway", "Prospect", "M4 Western Motorway at the Prospect Highway exit ramp looking east towards Parramatta"),
                new CamItem("m4_stmarys", "M4 Western Motorway", "St Marys", "M4 Western Motorway at Mamre Road looking west towards Penrith"),
                new CamItem("m7_glenwood", "M7", "Glenwood", "M7 Motorway at Sunnyholt Road looking east towards Bella Vista"),
                new CamItem("m7_horsleydr", "M7 at The Horsley Drive", "Horsley Park", "M7 Motorway at The Horsley Drive looking south towards Hoxton Park"),
                new CamItem("oldwindsorrd", "Old Windsor Road", "Beaumont Hills", "The intersection of Old Windsor Road and Windsor Road looking south towards Parramatta"),
                new CamItem("oldwindsorrd_winstonhills", "Old Windsor Road", "Winston Hills", "Old Windsor Road at Abbott Road looking north towards Bella Vista"),
                new CamItem("parrard_parra", "Parramatta Road", "Parramatta", "Parramatta Road at Woodville Road looking east towards Auburn"),
                new CamItem("sevenhillsrd_sevenhills", "Seven Hills Road", "Seven Hills", "Seven Hills Road at Abbot Road looking west towards Seven Hills"),
                new CamItem("silverwaterrd_silverwater", "Silverwater Road", "Silverwater", "Silverwater Road at M4 Western Motorway looking south towards Auburn"),
        }
        ));

        list.add(new PlaceItem( "Syndey South", new CamItem[] {
                new CamItem("5ways", "5 Ways", "Miranda", "5 ways at The Boulevarde looking west towards Sutherland"),
                new CamItem("audleyrd_audley", "Audley Road", "Audley Weir", "Audley Road at Audley Weir looking east towards Sir Bertram Stevens Drive"),
                new CamItem("humehwy_bankstown", "Hume Highway", "Bankstown", "Corner of Hume Highway and Stacey Street looking east towards Strathfield"),

                new CamItem("humehwy_liverpool", "Hume Highway", "Cumberland Highway, Liverpool", "Corner of Hume Highway and Cumberland Highway looking south towards Casula"),
                new CamItem("elizabethdr_livepool", "Hume Highway", "Elizabeth Drive, Liverpool", "Hume Highway at Elizabeth Drive looking north toward Lansvale"),

                new CamItem("humehwy_villawood", "Hume Highway", "Villawood", "Corner of Hume Highway and Woodville Road looking east towards Bass Hill"),
                new CamItem("humehwy_campbelltown", "Hume Motorway", "Campbelltown", "Corner of Hume Motorway and Narellan Road looking north towards Liverpool"),
                new CamItem("humehwy_standrews", "Hume Motorway", "St Andrews", "Corner of Hume Motorway and Raby Road looking north towards Liverpool"),
                new CamItem("m5_liverpool", "M5", "Liverpool", "M5 at Hume Highway looking east towards Sydney"),
                new CamItem("m5_milperra", "M5", "Milperra", "M5 Motorway at Henry Lawson Drive looking east towards Beverley Hills"),
                new CamItem("m5_padstow", "M5", "Padstow", "M5 at Fairford Road looking east towards Arncliffe"),
                new CamItem("m5_m7", "M5 / M7", "", "Junction of M5 and M7 looking south towards Ingleburn"),
                new CamItem("narelland_campbelltown", "Narellan Road", "Campbelltown", "Narellan Road at Blaxland Road looking north-west towards M1 Hume Motorway"),

                new CamItem("alfords_bangorbp", "New Illawarra Road", "Bangor Bypass", "New Illawarra Road at Bangor Bypass looking south towards Lucas Heights"),

                new CamItem("f6_waterfall", "Princes Highway", "Heathcote", "Princes Highway at Heathcote looking south towards Wollongong"),
                new CamItem("princeshwy_sutherland", "Princes Highway", "Sutherland", "Princes Highway at President Avenue looking south towards Waterfall"),
        }
        ));

        list.add(new PlaceItem("Regional North", new CamItem[] {
                new CamItem("hunterexp_buchanan", "Hunter Expressway", "Buchanan", "Hunter Expressway at Buchanan Interchange looking West towards Loxford"),
                new CamItem("hunterexp_allandale", "Hunter Expressway and Lovedale Rd", "", "Hunter Expressway at Allandale Interchange looking East towards Loxford"),
                new CamItem("hunterexp_branxton", "Hunter Expressway and Wine Country Dr", "", "Hunter Expressway at Branxton Interchange looking West towards Belford"),


                new CamItem("f3_mooney", "M1 Pacific Motorway", "Hawkesbury River", "M1 Pacific Motorway crossing the Hawkesbury River Bridge looking south towards Sydney"),
                new CamItem("hunterexpressway_m1", "M1 Pacific Motorway", "Hunter Expressway", "M1 Pacific Motorway at Hunter Expressway looking south towards Sydney"),
                new CamItem("f3_johnrenshawdr", "M1 Pacific Motorway", "John Renshaw Drive", "M1 Pacific Motorway at John Renshaw Drive looking south towards Sydney"),
                new CamItem("f3_kariong", "M1 Pacific Motorway", "Kariong", "M1 Pacific Motorway at the Kariong on ramp looking south towards Sydney"),
                new CamItem("f3_mountwhite", "M1 Pacific Motorway", "Mount White", "M1 Pacific Motorway at the Mount White heavy vehicle checking station looking north towards Calga"),
                new CamItem("f3_ourimbah", "M1 Pacific Motorway", "Ourimbah", "M1 Pacific Motorway at Ourimbah on ramp looking north towards Wyong"),
                new CamItem("f3_sparkesrd", "M1 Pacific Motorway", "Sparks Road", "M1 Pacific Motorway at Sparks Road looking north towards Newcastle"),
                new CamItem("f3_wahroonga", "M1 Pacific Motorway", "Wahroonga", "The Pacific Highway on ramp to the M1 Pacific Motorway looking north towards the Central Coast"),
                new CamItem("f3_windybanks", "M1 Pacific Motorway", "Windy Banks", "M1 Pacific Motorway at the Windy Banks on ramp looking south towards Hornsby"),
                new CamItem("newenglandhwy_hexham", "New England Highway", "Hexham", "New England Highway near Hexham Bridge looking south towards Newcastle"),
                new CamItem("newcastlelinkrd_newcastle", "Newcastle Road", "Newcastle", "Newcastle Road at Crest Road looking west towards M1 Pacific Motorway"),


                new CamItem("pacifichwy_macksville", "Pacific Highway", "Macksville", "Pacific Highway at Wallace Street looking north towards Urunga"),
                new CamItem("pacifichwy_tomago", "Pacific Highway", "Tomago", "Pacific Highway near Old Punt Road looking south-west towards Hexham"),
        }
        ));

        list.add(new PlaceItem( "Regional South", new CamItem[] {
                new CamItem("fiveislands_portkembla", "Five Islands Road", "Port Kembla", "Five Island Road at Springhill Road Looking south-east towards Warilla"),


                new CamItem("kosciuszkord_wilsonsvalley", "Kosciuszko Road", "Wilson's Valley", "Wilson's Valley chain bay looking south-west towards Perisher Valley"),
                new CamItem("f6_mtousley", "M1 Princes Motorway", "Mt Ousley", "M1 Princes Motorway at Mt Ousley Road looking north towards Sydney"),


                new CamItem("memorialdr_towradge", "Memorial Drive", "Towradgi", "Memorial Drive at Towradgi Road looking north towards Bulli"),

                new CamItem("princeshwy_albionparkrail", "Princes Highway", "Albion Park Rail", "Princes Highway at Airport Road looking north towards Wollongong"),
                new CamItem("princeshwy_batemans", "Princes Highway", "Batemans Bay", "Princes Highway at Beach Road looking north towards Nowra"),
                new CamItem("princeshwy_bulli", "Princes Highway", "Bulli", "Princes Highway at Point Street looking north towards Sydney"),
                new CamItem("princeshwy_wollongong", "Princes Highway", "Wollongong", "Princes Highway near Bourke Street looking north towards Bulli"),

                new CamItem("shellharbour_warilla", "Shellharbour Road", "Warilla", "Shellharbour Road at Lake Entrance Road looking north towards Port Kembla"),
        }
        ));


        ITEMS = Collections.unmodifiableList(list);
    }

}
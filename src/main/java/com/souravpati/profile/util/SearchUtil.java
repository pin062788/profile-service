package com.souravpati.profile.util;


public class SearchUtil {

    public static  final String POST ="POST";
    public static  final String PUT ="PUT";
    public static  final String GET ="GET";
    public static  final String SEACRH_ENDPOINT ="/my_index/my_type/_search";

    public static final  String MATCH_ALL= "{\n" +
            "    \"query\": {\n" +
            "        \"match_all\": {}\n" +
            "    }\n" +
            "}";
}

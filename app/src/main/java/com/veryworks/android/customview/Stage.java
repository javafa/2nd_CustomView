package com.veryworks.android.customview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2/21/2017.
 */

public class Stage {

    int mapOne[][] = {
        {0,0,1,0,0,0,0,0,0,0},
        {0,0,1,1,0,1,1,1,1,0},
        {0,1,0,0,0,0,0,0,1,0},
        {0,1,0,1,1,1,1,0,0,0},
        {0,1,0,0,0,0,1,0,1,1},
        {0,1,1,1,1,0,1,0,1,0},
        {0,1,0,0,0,0,1,0,1,0},
        {0,1,0,1,1,1,1,0,1,0},
        {0,1,0,1,0,0,0,0,1,0},
        {0,0,0,1,0,1,1,0,0,2},
    };

    int mapTwo[][] = {
            {0,0,1,0,0,0,0,0,0,0},
            {0,0,1,1,0,1,1,0,1,0},
            {0,1,0,0,0,0,0,0,1,0},
            {0,1,0,1,1,1,1,0,1,0},
            {0,1,0,0,0,0,1,0,1,0},
            {0,1,1,1,1,0,1,0,1,0},
            {0,1,0,0,0,0,1,0,1,0},
            {0,1,0,1,0,1,1,0,1,0},
            {0,1,0,1,0,1,0,0,1,0},
            {0,0,0,1,0,0,0,0,1,2},
    };

    static List<int[][]> stageArray = new ArrayList();

    public Stage(){
        stageArray.add(mapOne);
        stageArray.add(mapTwo);
    }

    public int[][] getStage(int stage){
        return stageArray.get(stage-1);
    }
}

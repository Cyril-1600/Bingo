package com.cyril.bingo.service;

import com.cyril.bingo.Dao.BingoDao;
import com.cyril.bingo.entity.Bingo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class BingoService {
    @Autowired
    BingoDao bingoDao;
    public String[][] bingoView;


    public void setRecord(Bingo bingo){
        bingoDao.save(bingo);
    }

    public Iterable<Bingo> getRecord(){
        return bingoDao.findAll();
    }

    public String[][] getBingoView(){
        return bingoView;
    }

    public void setBingoView(int i, int j, String symbol){
        bingoView[i][j] = symbol;
    }

    public BingoService() {
        initialBingoView();
    }

    private void initialBingoView(){
        int size = 3;
        bingoView = new String[size][size];
    }

    public void showBingoView(){
        for( int i = 0; i < bingoView.length; i++ ){
            for ( int j = 0; j < bingoView[i].length; j++ ){
                System.out.print(bingoView[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // 計算是否有結果
    public boolean hasResult(){
        boolean flag = false;

        return flag;
    }
}

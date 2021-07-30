package com.company;

import java.util.ArrayList;

public class Main {

    /**
     * Hash = digital signature
     *
     * Each block will have:
     *      list of transactions
     *      previous hash
     *      Hash
     */


    ArrayList<Block> blockchian = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        String[] genesisTransactions = {"satoshi sent me some more coins","i gave him a lot less back 0"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] secondBlockTransaction = {"Satoshi gave me more coins"};
        Block block2 = new Block(genesisBlock.getBlockHash(), secondBlockTransaction);

        System.out.println(genesisBlock.getBlockHash());
        System.out.println(block2.getBlockHash());


    }
}

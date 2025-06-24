package jp.miyabilink.atm;

import java.io.*;


/**
 * 口座クラス。
 * このクラスは、１つの銀行口座を表します。
 * @auther 美波
 * @deprecated 代わりにNewAccountクラスを利用してください
 * @see NewAccount
 * 
 */
public class Account2 implements Serializable{
  /** 残高 */
  private int zandaka;
  /** 口座名義名 */
  private String owner;

  /**
   * 他行に振込を行うメソッド。
   * @param bank 送金先銀行
   * @param dest 送金先口座
   * @param amount 送金する金額
   * @return 送金手数料
   * @exception java.lang.IllegalArgumentException 残高不足の時
   */
  public int transfer(Bank bank, Account dest, int amount){
    //anycode

  }

  
}

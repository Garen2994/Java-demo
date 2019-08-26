package garen.java.demo.demo11.DDZPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 *  实现模拟斗地主的功能
 *   1. 组合牌
 *   2. 洗牌
 *   3. 发牌
 *   4. 看牌

 *  1.准备牌：
 *  完成数字与纸牌的映射关系：
 *  使用双列Map(HashMap)集合，完成一个数字与字符串纸牌的对应关系(相当于一个字典)。
 *  2.洗牌：
 *  通过数字完成洗牌发牌
 *  3.发牌：
 *  将每个人以及底牌设计为ArrayList<String>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
 *  存放的过程中要求数字大小与斗地主规则的大小对应。
 *  将代表不同纸牌的数字分配给不同的玩家与底牌。
 *  4.看牌：
 *  通过Map集合找到对应字符展示。
 *  通过查询纸牌与数字的对应关系，由数字转成纸牌字符串再进行展示。
 */
public class DDZPractice {
    public static void main(String[] args) {

        //组合出一幅完整的牌 13*4 + 2

        HashMap<Integer, String> poker = new HashMap<Integer, String>();
        ArrayList<Integer> pokerKey = new ArrayList<Integer>();
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
//        String[] color = {"Diamond", "Spade", "Club", "Heart"};
        String[] color = {"♠","♥","♣","♦"};

        int index = 2;
        for (String num : number) {
            for (String cr : color) {
                poker.put(index, cr + num);
                pokerKey.add(index);
                index++;
            }
        }
        //存储大王,和小王,索引是从0~54,对应大王,小王,...3(牌的顺序从大到小)
        poker.put(0, "red joker");
        pokerKey.add(0);
        poker.put(1, "black joker");
        pokerKey.add(1);

        //洗牌
        Collections.shuffle(pokerKey);

        //发牌
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        //底牌：三张
        ArrayList<Integer> bottom = new ArrayList<Integer>();

        for (int i = 0; i < pokerKey.size(); i++) {
            if (i < 3) {
                bottom.add(pokerKey.get(i));
            } else if (i % 3 == 0) {
                player1.add(pokerKey.get(i));
            } else if (i % 3 == 1) {
                player2.add(pokerKey.get(i));
            } else if (i % 3 == 2) {
                player3.add(pokerKey.get(i));
            }

        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);

        //看牌,将玩家手中牌的编号,到Map集合中查找,根据键找值
        lookCards("Garen",player1,poker);
        lookCards("Skylar",player2,poker);
        lookCards("Ariana",player3,poker);
        lookCards("Bottom Cards",bottom,poker);
    }
    //看牌
    public static void lookCards(String name,ArrayList<Integer> array,HashMap<Integer,String> map){

        System.out.println("==================================");
        System.out.println(name + " is looking the cards: ");
        System.out.println("==================================");

        for (Integer key : array) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }


    }
}


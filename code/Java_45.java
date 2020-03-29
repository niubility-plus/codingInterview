
/*
 * [45] 扑克牌顺子
 *
 * 题目:LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 *      他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 *      “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成
 *      任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
 *      LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能组成
 *      顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 *
 *
 * 思路:1.可以这么理解，简单来说就是要是5个数字，最大和最小差值在5以内，并且没有重复数值。
 *        用一个set来填充数据，0不要放进去。set的大小加上0的个数必须为5个。此外set中数值差值在5以内。
 *
 *
 *
 */


import java.util.TreeSet;

class Java_45 {

    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5)
            return false;
        int size = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                size++;
            else
                set.add(numbers[i]);
        }
        if ((size + set.size()) != 5)
            return false;
        if (set.last() - set.first() < 5)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Java_45 java_40 = new Java_45();
    }


}
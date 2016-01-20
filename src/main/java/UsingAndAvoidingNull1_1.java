import com.google.common.base.Optional;

/**
 * Created by SunYi on 2016/1/20/0020.
 */
public class UsingAndAvoidingNull1_1 {
    /**
     * 主要是通过这种方式提醒编程人员区分NULL和空的区别，对其进行相应的处理
     * 好的做法是积极地把null和空区分开，以表示不同的含义
     */
    public static void main(String[] args) {
        //常规使用方式  Optional.of(T)
        Optional<Integer> i1 = Optional.of(5);
        System.out.println("i1.isPresent():  " + i1.isPresent());
        System.out.println("i1.get():  " + i1.get());

        //值为null的情况  Optional.of(null)
        Optional<Integer> i2 = Optional.of(null);
        System.out.println("i2.isPresent():  " + i2.isPresent());
        System.out.println("i2.get():  " + i2.get());

        //Optional.absent() 创建引用缺失的Optional实例
        //i.or(T) 返回Optional所包含的引用，若引用缺失，返回指定的值
        Optional<Integer> i3 = Optional.absent();
        System.out.println("i3.isPresent():  " + i3.isPresent());
        // 为null时get()会报错
        //System.out.println("i3.get():  " + i3.get());
        System.out.println("i3.or(0):  " + i3.or(0));

        //Optional.fromNullable(T) 创建指定引用的Optional实例，若引用为null则表示缺失
        //i.orNull()  返回Optional所包含的引用，若引用缺失，返回null
        Optional<Integer> i4 = Optional.fromNullable(null);
        System.out.println("i4.isPresent():  " + i4.isPresent());
        System.out.println("i4.orNull():  " + i4.orNull());
    }
}

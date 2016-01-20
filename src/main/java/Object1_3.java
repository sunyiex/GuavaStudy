import com.google.common.base.Objects;

/**
 * Created by SunYi on 2016/1/20/0020.
 */
public class Object1_3 {

    public static void main(String[] args) {
        System.out.println("Objects.equal(\"a\",\"a\"); -----> " + Objects.equal("a", "a"));
        System.out.println("Objects.equal(null, \"a\"); ---> " + Objects.equal(null, "a"));
        System.out.println("Objects.equal(\"a\", null); ---> " + Objects.equal("a", null));
        System.out.println("Objects.equal(null, null); --> " +  Objects.equal(null, null));

    }
}

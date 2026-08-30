package ya;

/* loaded from: classes.dex */
public abstract class l1 {
    public static boolean a(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }
}

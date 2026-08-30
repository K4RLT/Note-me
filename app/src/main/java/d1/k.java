package d1;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public static final k f15682u = new kotlin.jvm.internal.m(2);

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        p pVar = (p) obj2;
        if (str.length() == 0) {
            return pVar.toString();
        }
        return str + ", " + pVar;
    }
}

package j2;

import java.util.ArrayList;
import java.util.List;
import k1.p0;
import pe.z;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements df.p {
    public static final r A;
    public static final r B;
    public static final r C;
    public static final r D;
    public static final r E;
    public static final r F;
    public static final r G;
    public static final r H;
    public static final r I;
    public static final r J;
    public static final r K;
    public static final r L;
    public static final r M;
    public static final r N;

    /* renamed from: v, reason: collision with root package name */
    public static final r f18833v;

    /* renamed from: w, reason: collision with root package name */
    public static final r f18834w;

    /* renamed from: x, reason: collision with root package name */
    public static final r f18835x;

    /* renamed from: y, reason: collision with root package name */
    public static final r f18836y;

    /* renamed from: z, reason: collision with root package name */
    public static final r f18837z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18838u;

    static {
        int i = 2;
        f18833v = new r(i, 0);
        f18834w = new r(i, 1);
        f18835x = new r(i, 2);
        f18836y = new r(i, 3);
        f18837z = new r(i, 4);
        A = new r(i, 5);
        B = new r(i, 6);
        C = new r(i, 7);
        D = new r(i, 8);
        E = new r(i, 9);
        F = new r(i, 10);
        G = new r(i, 11);
        H = new r(i, 12);
        I = new r(i, 13);
        J = new r(i, 14);
        K = new r(i, 15);
        L = new r(i, 16);
        M = new r(i, 17);
        N = new r(i, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i10) {
        super(i);
        this.f18838u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        pe.d dVar;
        switch (this.f18838u) {
            case 0:
                return (e1.d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.addAll(list2);
                    return arrayList;
                }
                return list2;
            case 2:
                return (e1.l) obj;
            case 3:
                return (z) obj;
            case 4:
                return (z) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (z) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                g gVar = (g) obj;
                int i = ((g) obj2).f18786a;
                return gVar;
            case 10:
                return (p0) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList(list3);
                    arrayList2.addAll(list4);
                    return arrayList2;
                }
                return list4;
            case 13:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f18775a) == null) {
                    str = aVar2.f18775a;
                }
                if (aVar == null || (dVar = aVar.f18776b) == null) {
                    dVar = aVar2.f18776b;
                }
                return new a(str, dVar);
            case 17:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                n nVar = (n) obj2;
                Object valueOf = Float.valueOf(0.0f);
                j jVar = ((n) obj).f18823d;
                v vVar = s.f18855s;
                Object g8 = jVar.f18813u.g(vVar);
                if (g8 == null) {
                    g8 = valueOf;
                }
                float floatValue = ((Number) g8).floatValue();
                Object g10 = nVar.f18823d.f18813u.g(vVar);
                if (g10 != null) {
                    valueOf = g10;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}

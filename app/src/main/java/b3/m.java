package b3;

import androidx.lifecycle.w;
import b2.i0;
import pe.z;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements df.p {
    public static final m A;
    public static final m B;

    /* renamed from: v, reason: collision with root package name */
    public static final m f1677v;

    /* renamed from: w, reason: collision with root package name */
    public static final m f1678w;

    /* renamed from: x, reason: collision with root package name */
    public static final m f1679x;

    /* renamed from: y, reason: collision with root package name */
    public static final m f1680y;

    /* renamed from: z, reason: collision with root package name */
    public static final m f1681z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1682u;

    static {
        int i = 2;
        f1677v = new m(i, 0);
        f1678w = new m(i, 1);
        f1679x = new m(i, 2);
        f1680y = new m(i, 3);
        f1681z = new m(i, 4);
        A = new m(i, 5);
        B = new m(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i10) {
        super(i);
        this.f1682u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.f1682u) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((i0) obj).setUpdateBlock((df.l) obj2);
                return z.f22715a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((i0) obj).setReleaseBlock((df.l) obj2);
                return z.f22715a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((i0) obj).setModifier((d1.r) obj2);
                return z.f22715a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((i0) obj).setDensity((y2.c) obj2);
                return z.f22715a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((i0) obj).setLifecycleOwner((w) obj2);
                return z.f22715a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((i0) obj).setSavedStateRegistryOwner((m5.e) obj2);
                return z.f22715a;
            default:
                s c10 = androidx.compose.ui.viewinterop.a.c((i0) obj);
                int ordinal = ((y2.m) obj2).ordinal();
                if (ordinal != 0) {
                    i = 1;
                    if (ordinal != 1) {
                        l4.a.o();
                        return null;
                    }
                } else {
                    i = 0;
                }
                c10.setLayoutDirection(i);
                return z.f22715a;
        }
    }
}

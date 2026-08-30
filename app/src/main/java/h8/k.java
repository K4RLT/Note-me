package h8;

import a0.f0;
import android.graphics.Paint;
import eb.w;
import java.util.ArrayList;
import k1.j0;
import k1.l0;
import k1.r;
import k1.s0;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f17954a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f17955b;

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f17956c;

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f17957d;

    static {
        f0 i = l0.i();
        ((Paint) i.f48c).setAntiAlias(true);
        f17954a = i;
        f0 i10 = l0.i();
        ((Paint) i10.f48c).setAntiAlias(true);
        f17955b = i10;
        Float valueOf = Float.valueOf(0.0f);
        long j10 = r.e;
        pe.j[] jVarArr = {new pe.j(valueOf, new r(j10)), new pe.j(Float.valueOf(0.166f), new r(r.f19519j)), new pe.j(Float.valueOf(0.333f), new r(r.f19517g)), new pe.j(Float.valueOf(0.499f), new r(r.i)), new pe.j(Float.valueOf(0.666f), new r(r.f19516f)), new pe.j(Float.valueOf(0.833f), new r(r.f19518h)), new pe.j(Float.valueOf(0.999f), new r(j10))};
        ArrayList arrayList = new ArrayList(7);
        for (int i11 = 0; i11 < 7; i11++) {
            arrayList.add(new r(((r) jVarArr[i11].f22694v).f19523a));
        }
        ArrayList arrayList2 = new ArrayList(7);
        for (int i12 = 0; i12 < 7; i12++) {
            arrayList2.add(Float.valueOf(((Number) jVarArr[i12].f22693u).floatValue()));
        }
        f17956c = new s0(arrayList, arrayList2);
        f17957d = w.j(new pe.j[]{new pe.j(valueOf, new r(l0.d(4294967295L))), new pe.j(Float.valueOf(1.0f), new r(l0.c(16777215)))}, 0L, 0.0f, 6);
    }
}

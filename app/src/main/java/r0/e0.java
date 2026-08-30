package r0;
import b1.h0;
import n.c0;
import q.x;
import z0.d;

import com.google.android.filament.Texture;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24211u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24212v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f24213w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f24214x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f24215y;

    public /* synthetic */ e0(int i, int i10, int i11, a1 a1Var, u7.l2 l2Var, pe.j jVar, kotlin.jvm.internal.y yVar) {
        this.f24212v = i11;
        this.f24213w = l2Var;
        this.f24214x = jVar;
        this.f24215y = yVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        pe.j jVar;
        Object obj2;
        switch (this.f24211u) {
            case 0:
                g0 g0Var = (g0) this.f24213w;
                d dVar = (d) this.f24214x;
                c0 c0Var = (c0) this.f24215y;
                if (obj != g0Var) {
                    if (obj instanceof h0) {
                        int i10 = dVar.f31760a - this.f24212v;
                        int d2 = c0Var.d(obj);
                        if (d2 >= 0) {
                            i = c0Var.f20851c[d2];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        c0Var.h(Math.min(i10, i), obj);
                    }
                    return pe.z.f22715a;
                }
                x.o("A derived state calculation cannot read itself");
                return null;
            default:
                u7.l2 l2Var = (u7.l2) this.f24213w;
                pe.j jVar2 = (pe.j) this.f24214x;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f24215y;
                Texture texture = (Texture) obj;
                LinkedHashMap linkedHashMap = l2Var.O;
                LinkedHashMap linkedHashMap2 = l2Var.N;
                HashSet hashSet = l2Var.P;
                Integer num = (Integer) linkedHashMap.get(jVar2);
                if (num != null && num.intValue() == this.f24212v) {
                    linkedHashMap.remove(jVar2);
                }
                if (texture != null) {
                    hashSet.add(jVar2);
                }
                if (texture == null && (jVar = (pe.j) linkedHashMap2.get(jVar2)) != null && (obj2 = jVar.f22694v) == yVar.f19787u) {
                    hashSet.remove(jVar2);
                    linkedHashMap2.remove(jVar2);
                    l2Var.D.add(obj2);
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ e0(g0 g0Var, d dVar, c0 c0Var, int i) {
        this.f24213w = g0Var;
        this.f24214x = dVar;
        this.f24215y = c0Var;
        this.f24212v = i;
    }
}

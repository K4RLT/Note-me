package a1;
import b.a;

import androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV21;
import androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV29;
import androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV33;
import androidx.ink.authoring.latency.LatencyData;
import b8.ca;
import b8.e1;
import b8.z9;
import com.google.android.gms.internal.ads.gl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k1.o0;
import m2.d0;
import m2.e0;
import m2.p0;
import n.i0;
import o0.x1;
import pe.z;
import r0.y;
import w7.s9;
import wa.h6;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f204u;

    public /* synthetic */ i(int i) {
        this.f204u = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z finishesDrawCallsSetter$lambda$0;
        z finishesDrawCallsSetter$lambda$02;
        z finishesDrawCallsSetter$lambda$03;
        boolean z3;
        boolean z9;
        switch (this.f204u) {
            case 0:
                l lVar = (l) obj2;
                Map map = lVar.f211u;
                i0 i0Var = lVar.f212v;
                Object[] objArr = i0Var.f20893b;
                Object[] objArr2 = i0Var.f20894c;
                long[] jArr = i0Var.f20892a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j10 = jArr[i];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j10) < 128) {
                                    int i12 = (i << 3) + i11;
                                    Object obj3 = objArr[i12];
                                    Map c10 = ((o) objArr2[i12]).c();
                                    if (c10.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, c10);
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i10 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 1:
                return obj2;
            case 2:
                finishesDrawCallsSetter$lambda$0 = CanvasInProgressStrokesRenderHelperV21.finishesDrawCallsSetter$lambda$0((LatencyData) obj, ((Long) obj2).longValue());
                return finishesDrawCallsSetter$lambda$0;
            case 3:
                finishesDrawCallsSetter$lambda$02 = CanvasInProgressStrokesRenderHelperV29.finishesDrawCallsSetter$lambda$0((LatencyData) obj, ((Long) obj2).longValue());
                return finishesDrawCallsSetter$lambda$02;
            case 4:
                finishesDrawCallsSetter$lambda$03 = CanvasInProgressStrokesRenderHelperV33.finishesDrawCallsSetter$lambda$0((LatencyData) obj, ((Long) obj2).longValue());
                return finishesDrawCallsSetter$lambda$03;
            case 5:
                ((Integer) obj2).getClass();
                e1.d(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 6:
                ((Integer) obj2).getClass();
                e1.d(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 7:
                ((Integer) obj2).getClass();
                e1.d(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 8:
                r0.m mVar = (r0.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar = (r0.r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    x1.b("Correo", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 6, 0, 131070);
                } else {
                    rVar.U();
                }
                return z.f22715a;
            case 9:
                r0.m mVar2 = (r0.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r0.r rVar2 = (r0.r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    x1.b("Contraseña", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 6, 0, 131070);
                } else {
                    rVar2.U();
                }
                return z.f22715a;
            case 10:
                ((Integer) obj).intValue();
                s9 s9Var = (s9) obj2;
                s9Var.getClass();
                return s9Var.f29080a;
            case 11:
                ((Integer) obj2).getClass();
                z9.o(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 12:
                ((Integer) obj2).getClass();
                z9.o(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 13:
                ((Integer) obj2).getClass();
                z9.p(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 14:
                ((Integer) obj).intValue();
                ca caVar = (ca) obj2;
                caVar.getClass();
                return caVar.f1935a;
            case 15:
                ((Integer) obj2).getClass();
                e7.a(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 16:
                ((Integer) obj2).getClass();
                e7.a(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 17:
                ((Integer) obj2).getClass();
                h6.a(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 18:
                ((Integer) obj2).getClass();
                h6.a(y.L(1), (r0.m) obj);
                return z.f22715a;
            case 19:
                ((k1.p) obj).getClass();
                return z.f22715a;
            case 20:
                m2.g gVar = (m2.g) obj2;
                return qe.a(gVar.f20477v, e0.a(gVar.f20476u, e0.f20455a, (d) obj));
            case gl.zzm /* 21 */:
                return Integer.valueOf(((x2.l) obj2).f30064a);
            case 22:
                x2.p pVar = (x2.p) obj2;
                return qe.a(Float.valueOf(pVar.f30068a), Float.valueOf(pVar.f30069b));
            case 23:
                d dVar = (d) obj;
                x2.q qVar = (x2.q) obj2;
                y2.o oVar = new y2.o(qVar.f30071a);
                d0 d0Var = e0.f20469q;
                return qe.a(e0.a(oVar, d0Var, dVar), e0.a(new y2.o(qVar.f30072b), d0Var, dVar));
            case 24:
                return Integer.valueOf(((q2.s) obj2).f23369u);
            case 25:
                m2.m mVar3 = (m2.m) obj2;
                return qe.a(mVar3.f20522a, e0.a(mVar3.f20523b, e0.i, (d) obj));
            case 26:
                return Float.valueOf(((x2.a) obj2).f30042a);
            case 27:
                d dVar2 = (d) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add(e0.a((m2.e) list.get(i13), e0.f20456b, dVar2));
                }
                return arrayList;
            case 28:
                p0 p0Var = (p0) obj2;
                return qe.a(Integer.valueOf((int) (p0Var.f20546a >> 32)), Integer.valueOf((int) (p0Var.f20546a & 4294967295L)));
            default:
                d dVar3 = (d) obj;
                o0 o0Var = (o0) obj2;
                return qe.a(e0.a(new k1.r(o0Var.f19509a), e0.f20468p, dVar3), e0.a(new j1.b(o0Var.f19510b), e0.f20470r, dVar3), Float.valueOf(o0Var.f19511c));
        }
    }

    public /* synthetic */ i(int i, int i10) {
        this.f204u = i10;
    }
}

package a0;
import a0.j0;
import i0.h;
import r.b0;
import r.v;
import r.w;
import t.f1;
import z.m;

import androidx.work.CoroutineWorker;
import b8.z3;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.gl;
import g0.f1;
import o0.z1;
import r.s0;
import t.s1;
import u7.o1;

/* loaded from: classes.dex */
public final class j0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f74u;

    /* renamed from: v, reason: collision with root package name */
    public int f75v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f76w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(s1 s1Var, int i, te.c cVar, int i10) {
        super(2, cVar);
        this.f74u = i10;
        this.f76w = s1Var;
        this.f75v = i;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f74u) {
            case 0:
                return new j0((l0) this.f76w, this.f75v, cVar, 0);
            case 1:
                return new j0((CoroutineWorker) this.f76w, cVar, 1);
            case 2:
                return new j0((b5.b) this.f76w, cVar, 2);
            case 3:
                return new j0((j7.l) this.f76w, cVar, 3);
            case 4:
                return new j0((z3) this.f76w, cVar, 4);
            case 5:
                return new j0((Purchase) this.f76w, cVar, 5);
            case 6:
                return new j0((h) this.f76w, cVar, 6);
            case 7:
                return new j0((f1) this.f76w, cVar, 7);
            case 8:
                return new j0((g5.f) this.f76w, cVar, 8);
            case 9:
                return new j0((g5.o0) this.f76w, cVar, 9);
            case 10:
                return new j0((pf.q) this.f76w, cVar, 10);
            case 11:
                return new j0((z1) this.f76w, cVar, 11);
            case 12:
                return new j0((q2.c) this.f76w, cVar, 12);
            case 13:
                return new j0((v) this.f76w, cVar, 13);
            case 14:
                return new j0((w) this.f76w, cVar, 14);
            case 15:
                return new j0((b0) this.f76w, cVar, 15);
            case 16:
                return new j0((s0) this.f76w, cVar, 16);
            case 17:
                return new j0((f5.a) this.f76w, cVar, 17);
            case 18:
                return new j0((o1) this.f76w, cVar, 18);
            case 19:
                return new j0((df.l) this.f76w, cVar, 19);
            case 20:
                return new j0((v1.h0) this.f76w, cVar, 20);
            case gl.zzm /* 21 */:
                return new j0((vd.z) this.f76w, cVar, 21);
            default:
                return new j0((m) this.f76w, this.f75v, cVar, 22);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f74u) {
            case 0:
                j0 j0Var = (j0) create((f1) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                j0Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 10:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 11:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 12:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 14:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 16:
                ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 17:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 18:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 19:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 20:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case gl.zzm /* 21 */:
                return ((j0) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                j0 j0Var2 = (j0) create((f1) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                j0Var2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x011f -> B:60:0x0110). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0136 -> B:58:0x0139). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f74u = i;
        this.f76w = obj;
    }
}

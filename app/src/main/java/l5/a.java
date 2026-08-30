package l5;

import com.google.android.gms.internal.ads.gl;
import df.p;
import g5.v;
import java.util.ArrayList;
import java.util.List;
import n0.o;
import pf.d1;
import q.k;
import r0.a1;
import r0.o1;
import rf.l;
import rf.t;
import t.c1;
import t.z1;
import u7.m3;
import vd.z;
import y3.s;

/* loaded from: classes.dex */
public final class a extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19897u;

    /* renamed from: v, reason: collision with root package name */
    public int f19898v;

    /* renamed from: w, reason: collision with root package name */
    public Object f19899w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19900x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f19897u = i;
        this.f19899w = obj;
        this.f19900x = obj2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f19897u) {
            case 0:
                return new a((v) this.f19899w, (a1.f) this.f19900x, cVar, 0);
            case 1:
                a aVar = new a((n0.b) this.f19900x, cVar, 1);
                aVar.f19899w = obj;
                return aVar;
            case 2:
                return new a((o) this.f19899w, (k) this.f19900x, cVar, 2);
            case 3:
                return new a((v.i) this.f19899w, (v.f) this.f19900x, cVar, 3);
            case 4:
                return new a((v.i) this.f19899w, (v.g) this.f19900x, cVar, 4);
            case 5:
                return new a((sf.g) this.f19899w, (o1) this.f19900x, cVar, 5);
            case 6:
                a aVar2 = new a((sf.g) this.f19900x, cVar, 6);
                aVar2.f19899w = obj;
                return aVar2;
            case 7:
                a aVar3 = new a((l) this.f19900x, cVar, 7);
                aVar3.f19899w = obj;
                return aVar3;
            case 8:
                a aVar4 = new a((f5.a) this.f19900x, cVar, 8);
                aVar4.f19899w = obj;
                return aVar4;
            case 9:
                return new a((z1) this.f19899w, (p) this.f19900x, cVar, 9);
            case 10:
                return new a((d1) this.f19899w, (c1) this.f19900x, cVar, 10);
            case 11:
                a aVar5 = new a((tf.e) this.f19900x, cVar, 11);
                aVar5.f19899w = obj;
                return aVar5;
            case 12:
                a aVar6 = new a((tf.f) this.f19900x, cVar, 12);
                aVar6.f19899w = obj;
                return aVar6;
            case 13:
                a aVar7 = new a((sf.h) this.f19900x, cVar, 13);
                aVar7.f19899w = obj;
                return aVar7;
            case 14:
                return new a((m3) this.f19899w, (List) this.f19900x, cVar, 14);
            case 15:
                return new a((m3) this.f19899w, (o7.b) this.f19900x, cVar, 15);
            case 16:
                return new a((q.d) this.f19899w, (o7.b) this.f19900x, cVar, 16);
            case 17:
                return new a((m3) this.f19899w, (String) this.f19900x, cVar, 17);
            case 18:
                return new a((z) this.f19899w, (String) this.f19900x, cVar, 18);
            case 19:
                return new a((j6.i) this.f19899w, (ArrayList) this.f19900x, cVar, 19);
            case 20:
                return new a((a1) this.f19899w, (a1) this.f19900x, cVar, 20);
            case gl.zzm /* 21 */:
                return new a((q.d) this.f19899w, (kotlin.jvm.internal.v) this.f19900x, cVar, 21);
            case 22:
                return new a((xd.i) this.f19900x, cVar, 22);
            case 23:
                a aVar8 = new a((List) this.f19900x, cVar, 23);
                aVar8.f19899w = obj;
                return aVar8;
            case 24:
                return new a((j6.i) this.f19900x, cVar, 24);
            default:
                return new a((p) this.f19899w, this.f19900x, cVar, 25);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19897u) {
            case 0:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((a) create((t) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 10:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 11:
                return ((a) create((t) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 12:
                return ((a) create((sf.h) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                return ((a) create(obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 14:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 16:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 17:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 18:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 19:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 20:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case gl.zzm /* 21 */:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 22:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 23:
                return ((a) create((s) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 24:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((a) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:18:0x0087). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f19897u = i;
        this.f19900x = obj;
    }
}

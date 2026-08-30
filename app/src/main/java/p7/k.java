package p7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import pf.d1;
import r0.a1;
import r0.o1;
import u7.m3;

/* loaded from: classes.dex */
public final class k extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22513u;

    /* renamed from: v, reason: collision with root package name */
    public int f22514v;

    /* renamed from: w, reason: collision with root package name */
    public int f22515w;

    /* renamed from: x, reason: collision with root package name */
    public Object f22516x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f22517y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f22518z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, Context context, String str, te.c cVar, m3 m3Var) {
        super(2, cVar);
        this.f22513u = 4;
        this.f22516x = str;
        this.f22517y = context;
        this.f22518z = m3Var;
        this.f22515w = i;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f22513u) {
            case 0:
                return new k((String) this.f22516x, (a1) this.f22517y, (a1) this.f22518z, cVar, 0);
            case 1:
                return new k((s6.k) this.f22516x, (d1) this.f22517y, this.f22515w, (s6.g) this.f22518z, cVar);
            case 2:
                return new k((sf.g[]) this.f22516x, this.f22515w, (AtomicInteger) this.f22517y, (rf.h) this.f22518z, cVar);
            case 3:
                k kVar = new k(this.f22515w, (Context) this.f22518z, cVar);
                kVar.f22517y = obj;
                return kVar;
            case 4:
                String str = (String) this.f22516x;
                return new k(this.f22515w, (Context) this.f22517y, str, cVar, (m3) this.f22518z);
            default:
                return new k((nd.o) this.f22516x, (pe.o) this.f22517y, (df.a) this.f22518z, cVar, 5);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22513u) {
            case 0:
                return ((k) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((k) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((k) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((k) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((k) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((k) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0362  */
    /* JADX WARN: Type inference failed for: r0v10, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r14v13, types: [je.c] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0374 -> B:124:0x0375). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, Context context, te.c cVar) {
        super(2, cVar);
        this.f22513u = 3;
        this.f22515w = i;
        this.f22518z = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f22513u = i;
        this.f22516x = obj;
        this.f22517y = obj2;
        this.f22518z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s6.k kVar, d1 d1Var, int i, s6.g gVar, te.c cVar) {
        super(2, cVar);
        this.f22513u = 1;
        this.f22516x = kVar;
        this.f22517y = d1Var;
        this.f22515w = i;
        this.f22518z = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sf.g[] gVarArr, int i, AtomicInteger atomicInteger, rf.h hVar, te.c cVar) {
        super(2, cVar);
        this.f22513u = 2;
        this.f22516x = gVarArr;
        this.f22515w = i;
        this.f22517y = atomicInteger;
        this.f22518z = hVar;
    }
}

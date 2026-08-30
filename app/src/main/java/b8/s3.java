package b8;
import ca.a;
import l.a;
import m.d;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s3 extends ve.i implements df.p {
    public int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ u3 C;
    public final /* synthetic */ String D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: u, reason: collision with root package name */
    public long f2701u;

    /* renamed from: v, reason: collision with root package name */
    public yf.c f2702v;

    /* renamed from: w, reason: collision with root package name */
    public u3 f2703w;

    /* renamed from: x, reason: collision with root package name */
    public String f2704x;

    /* renamed from: y, reason: collision with root package name */
    public int f2705y;

    /* renamed from: z, reason: collision with root package name */
    public int f2706z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(int i, u3 u3Var, String str, int i10, int i11, te.c cVar) {
        super(2, cVar);
        this.B = i;
        this.C = u3Var;
        this.D = str;
        this.E = i10;
        this.F = i11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new s3(this.B, this.C, this.D, this.E, this.F, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        u3 u3Var;
        yf.c cVar;
        String str;
        int i;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13 = this.A;
        if (i13 != 0) {
            if (i13 == 1) {
                i10 = this.f2706z;
                i = this.f2705y;
                j10 = this.f2701u;
                str = this.f2704x;
                u3Var = this.f2703w;
                cVar = this.f2702v;
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            long currentTimeMillis = System.currentTimeMillis();
            int i14 = this.B;
            if (i14 < 0) {
                i14 = 0;
            }
            j10 = currentTimeMillis - (i14 * 3600000);
            u3Var = this.C;
            cVar = u3Var.f2823c;
            this.f2702v = cVar;
            this.f2703w = u3Var;
            str = this.D;
            this.f2704x = str;
            this.f2701u = j10;
            int i15 = this.E;
            this.f2705y = i15;
            int i16 = this.F;
            this.f2706z = i16;
            this.A = 1;
            Object f10 = cVar.f(this);
            ue.a aVar = ue.a.f27192u;
            if (f10 == aVar) {
                return aVar;
            }
            i = i15;
            i10 = i16;
        }
        String str2 = str;
        u3 u3Var2 = u3Var;
        yf.c cVar2 = cVar;
        long j11 = j10;
        try {
            List<ca> list = u3.l(u3Var2).f2246a;
            ArrayList arrayList2 = new ArrayList(qe.d(list, 10));
            for (ca caVar : list) {
                if (!kotlin.jvm.internal.a(caVar.f1935a, str2)) {
                    arrayList = arrayList2;
                } else {
                    ArrayList arrayList3 = arrayList2;
                    if (i < 0) {
                        i11 = 0;
                    } else {
                        i11 = i;
                    }
                    if (i10 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i10;
                    }
                    arrayList = arrayList3;
                    caVar = a(caVar, i11, i12, 0, j11, false, 257951);
                }
                arrayList.add(caVar);
                arrayList2 = arrayList;
            }
            u3.n(u3Var2, new j3(arrayList2));
            cVar2.j(null);
            return pe.z.f22715a;
        } catch (Throwable th) {
            cVar2.j(null);
            throw th;
        }
    }
}

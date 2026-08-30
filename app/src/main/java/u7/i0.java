package u7;
import b1.v;
import b1.w;
import k1.l0;
import p7.c;
import w7.s0;

import android.content.Context;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26295u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f26296v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26297w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26298x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26299y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26300z;

    public /* synthetic */ i0(nd.o oVar, Context context, String str, int i, int i10) {
        this.f26295u = 1;
        this.f26299y = oVar;
        this.f26296v = context;
        this.f26300z = str;
        this.f26297w = i;
        this.f26298x = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.a
    public final Object invoke() {
        switch (this.f26295u) {
            case 0:
                m3 m3Var = (m3) this.f26299y;
                Context context = (Context) this.f26296v;
                h8.f fVar = (h8.f) this.f26300z;
                int i = this.f26298x;
                m3Var.V0(this.f26297w, context, Integer.valueOf(i));
                fVar.b(l0.c(i));
                return pe.z.f22715a;
            case 1:
                nd.o oVar = (nd.o) this.f26299y;
                Context context2 = (Context) this.f26296v;
                String str = (String) this.f26300z;
                int i10 = this.f26297w;
                int i11 = this.f26298x;
                try {
                    oVar.getClass();
                    nd.o.g(i10, i11, context2, str).delete();
                } catch (Throwable unused) {
                }
                return pe.z.f22715a;
            case 2:
                m3 m3Var2 = (m3) this.f26299y;
                v vVar = (v) this.f26296v;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f26300z;
                int i12 = this.f26297w;
                int i13 = this.f26298x;
                m3Var2.u(i12, i13);
                vVar.getClass();
                ListIterator listIterator = w.e(vVar).f1328c.listIterator(0);
                while (listIterator.hasNext()) {
                    m3Var2.N0(i12, i13, (Context) yVar.f19787u, (String) listIterator.next());
                }
                m3Var2.U();
                vVar.clear();
                return pe.z.f22715a;
            case 3:
                m3 m3Var3 = (m3) this.f26299y;
                String str2 = (String) this.f26296v;
                s0 s0Var = (s0) this.f26300z;
                String T = m3Var3.T(str2, this.f26297w, this.f26298x);
                if (T != null) {
                    s0Var.invoke(T);
                }
                return pe.z.f22715a;
            case 4:
                m3 m3Var4 = (m3) this.f26299y;
                String str3 = (String) this.f26300z;
                m3Var4.N0(this.f26297w, this.f26298x, (Context) this.f26296v, str3);
                return pe.z.f22715a;
            case 5:
                d8 d8Var = (d8) this.f26296v;
                d dVar = (d) this.f26300z;
                m3 m3Var5 = (m3) this.f26299y;
                String str4 = d8Var.f26105a;
                if (!str4.equals(dVar.f26047q)) {
                    m3.r1(m3Var5, this.f26297w, this.f26298x, dVar.f26033a, null, null, null, null, null, str4, Integer.valueOf(d8Var.e), Float.valueOf(d8Var.f26109f), 248);
                }
                return pe.z.f22715a;
            default:
                m3 m3Var6 = (m3) this.f26299y;
                d dVar2 = (d) this.f26296v;
                c cVar = (c) this.f26300z;
                m3.r1(m3Var6, this.f26297w, this.f26298x, dVar2.f26033a, null, cVar.f22431a, null, null, null, null, null, null, 2024);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ i0(m3 m3Var, int i, int i10, Object obj, Object obj2, int i11) {
        this.f26295u = i11;
        this.f26299y = m3Var;
        this.f26297w = i;
        this.f26298x = i10;
        this.f26296v = obj;
        this.f26300z = obj2;
    }

    public /* synthetic */ i0(m3 m3Var, int i, int i10, String str, Context context) {
        this.f26295u = 4;
        this.f26299y = m3Var;
        this.f26297w = i;
        this.f26298x = i10;
        this.f26300z = str;
        this.f26296v = context;
    }

    public /* synthetic */ i0(m3 m3Var, int i, Context context, int i10, h8.f fVar) {
        this.f26295u = 0;
        this.f26299y = m3Var;
        this.f26297w = i;
        this.f26296v = context;
        this.f26298x = i10;
        this.f26300z = fVar;
    }

    public /* synthetic */ i0(d8 d8Var, d dVar, m3 m3Var, int i, int i10) {
        this.f26295u = 5;
        this.f26296v = d8Var;
        this.f26300z = dVar;
        this.f26299y = m3Var;
        this.f26297w = i;
        this.f26298x = i10;
    }
}

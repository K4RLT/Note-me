package u7;
import d.i;
import e7.r;
import o7.b;
import r0.a1;
import x7.f0;
import x7.j;

import android.app.Activity;
import android.content.Context;
import com.daren.scraply.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements df.a {
    public final /* synthetic */ b A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27020u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27021v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f27022w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f27023x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27024y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f27025z;

    public /* synthetic */ x3(int i, b bVar, i iVar, Context context, a1 a1Var, a1 a1Var2) {
        this.f27020u = 2;
        this.f27025z = i;
        this.A = bVar;
        this.f27021v = iVar;
        this.f27023x = context;
        this.f27022w = a1Var;
        this.f27024y = a1Var2;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f27020u) {
            case 0:
                Activity activity = (Activity) this.f27021v;
                final m3 m3Var = (m3) this.f27024y;
                this.f27022w.setValue(Boolean.FALSE);
                r rVar = r.f15993z;
                final int i = 0;
                final Context context = this.f27023x;
                final int i10 = this.f27025z;
                final b bVar = this.A;
                df.a aVar = new df.a() { // from class: u7.s3
                    @Override // df.a
                    public final Object invoke() {
                        int i11 = i;
                        pe.z zVar = pe.z.f22715a;
                        switch (i11) {
                            case 0:
                                pe.n nVar = f2.f26168a;
                                m3 m3Var2 = m3Var;
                                Context context2 = context;
                                ArrayList a02 = m3Var2.a0(context2);
                                sf.n0 n0Var = f0.f30184a;
                                String string = context2.getString(R.string.loading_exporting);
                                string.getClass();
                                f0.e(string);
                                wf.e eVar = pf.l0.f22767a;
                                pf.b0.x(pf.b0.b(wf.d.f29913w), null, new e2(a02, context2, m3Var2, i10, bVar, null, 0), 3);
                                return zVar;
                            default:
                                pe.n nVar2 = f2.f26168a;
                                m3 m3Var3 = m3Var;
                                Context context3 = context;
                                ArrayList a03 = m3Var3.a0(context3);
                                sf.n0 n0Var2 = f0.f30184a;
                                String string2 = context3.getString(R.string.loading_exporting);
                                string2.getClass();
                                f0.e(string2);
                                wf.e eVar2 = pf.l0.f22767a;
                                pf.b0.x(pf.b0.b(wf.d.f29913w), null, new e2(a03, context3, m3Var3, i10, bVar, null, 1), 3);
                                return zVar;
                        }
                    }
                };
                rVar.getClass();
                rVar.e(activity, aVar);
                break;
            case 1:
                Activity activity2 = (Activity) this.f27021v;
                final m3 m3Var2 = (m3) this.f27024y;
                this.f27022w.setValue(Boolean.FALSE);
                r rVar2 = r.f15993z;
                final int i11 = 1;
                final Context context2 = this.f27023x;
                final int i12 = this.f27025z;
                final b bVar2 = this.A;
                df.a aVar2 = new df.a() { // from class: u7.s3
                    @Override // df.a
                    public final Object invoke() {
                        int i112 = i11;
                        pe.z zVar = pe.z.f22715a;
                        switch (i112) {
                            case 0:
                                pe.n nVar = f2.f26168a;
                                m3 m3Var22 = m3Var2;
                                Context context22 = context2;
                                ArrayList a02 = m3Var22.a0(context22);
                                sf.n0 n0Var = f0.f30184a;
                                String string = context22.getString(R.string.loading_exporting);
                                string.getClass();
                                f0.e(string);
                                wf.e eVar = pf.l0.f22767a;
                                pf.b0.x(pf.b0.b(wf.d.f29913w), null, new e2(a02, context22, m3Var22, i12, bVar2, null, 0), 3);
                                return zVar;
                            default:
                                pe.n nVar2 = f2.f26168a;
                                m3 m3Var3 = m3Var2;
                                Context context3 = context2;
                                ArrayList a03 = m3Var3.a0(context3);
                                sf.n0 n0Var2 = f0.f30184a;
                                String string2 = context3.getString(R.string.loading_exporting);
                                string2.getClass();
                                f0.e(string2);
                                wf.e eVar2 = pf.l0.f22767a;
                                pf.b0.x(pf.b0.b(wf.d.f29913w), null, new e2(a03, context3, m3Var3, i12, bVar2, null, 1), 3);
                                return zVar;
                        }
                    }
                };
                rVar2.getClass();
                rVar2.e(activity2, aVar2);
                break;
            default:
                i iVar = (i) this.f27021v;
                a1 a1Var = (a1) this.f27024y;
                this.f27022w.setValue(Boolean.FALSE);
                Integer valueOf = Integer.valueOf(this.f27025z);
                b bVar3 = this.A;
                a1Var.setValue(new pe.j(valueOf, bVar3));
                if (!j.x(iVar, this.f27023x, e.f0(bVar3.f21849b).concat(".scrap"))) {
                    a1Var.setValue(null);
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ x3(Activity activity, a1 a1Var, Context context, m3 m3Var, int i, b bVar, int i10) {
        this.f27020u = i10;
        this.f27021v = activity;
        this.f27022w = a1Var;
        this.f27023x = context;
        this.f27024y = m3Var;
        this.f27025z = i;
        this.A = bVar;
    }
}

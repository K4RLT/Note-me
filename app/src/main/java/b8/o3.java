package b8;
import b1.v;
import c3.v;
import p.a1;

import android.widget.Toast;
import com.daren.scraply.MainActivity;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class o3 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2478u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2479v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f2478u = i;
        this.f2479v = obj;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2478u) {
            case 0:
                return new o3((u3) this.f2479v, cVar, 0);
            case 1:
                return new o3((v) this.f2479v, cVar, 1);
            case 2:
                return new o3((MainActivity) this.f2479v, cVar, 2);
            case 3:
                return new o3((a1) this.f2479v, cVar, 3);
            case 4:
                return new o3((df.p) this.f2479v, cVar, 4);
            default:
                return new o3((v) this.f2479v, cVar, 5);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2478u) {
            case 0:
                return ((o3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                o3 o3Var = (o3) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                o3Var.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                o3 o3Var2 = (o3) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                o3Var2.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                o3 o3Var3 = (o3) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                o3Var3.invokeSuspend(zVar4);
                return zVar4;
            case 4:
                o3 o3Var4 = (o3) create(zVar, cVar);
                pe.z zVar5 = pe.z.f22715a;
                o3Var4.invokeSuspend(zVar5);
                return zVar5;
            default:
                o3 o3Var5 = (o3) create(zVar, cVar);
                pe.z zVar6 = pe.z.f22715a;
                o3Var5.invokeSuspend(zVar6);
                return zVar6;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2478u;
        int i10 = 0;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f2479v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                return qe.l.K(u3.l((u3) obj2).f2246a, new n3(i10, new m3(System.currentTimeMillis(), i10)));
            case 1:
                pe.a.e(obj);
                ((v) obj2).show();
                return zVar;
            case 2:
                pe.a.e(obj);
                MainActivity mainActivity = (MainActivity) obj2;
                Toast.makeText(mainActivity, mainActivity.getString(R.string.import_scrap_ok), 1).show();
                return zVar;
            case 3:
                pe.a.e(obj);
                a1 a1Var = (a1) obj2;
                if (a1Var.f22098g.isEmpty()) {
                    a1Var.f22094b.D.k(a1Var.f22093a);
                }
                return zVar;
            case 4:
                pe.a.e(obj);
                ((df.p) obj2).invoke(new Integer(-1), new Integer(0));
                return zVar;
            default:
                pe.a.e(obj);
                v vVar = (v) obj2;
                if (!vVar.isEmpty()) {
                    vVar.clear();
                }
                return zVar;
        }
    }
}

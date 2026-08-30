package u7;
import k1.r;
import o0.y;
import q1.e;
import r0.m;
import w7.n4;
import x7.g0;

import android.content.Context;
import android.widget.Toast;
import com.daren.scraply.R;
import java.util.Set;
import w7.t9;
import wa.m9;

/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25902u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f25903v;

    public /* synthetic */ a4(Context context, int i) {
        this.f25902u = i;
        this.f25903v = context;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25902u;
        pe.z zVar = pe.z.f22715a;
        boolean z3 = false;
        Context context = this.f25903v;
        switch (i) {
            case 0:
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    y.b(m9.a(), context.getString(R.string.gallery_add_notebook), null, r.f19515d, rVar, 3072, 4);
                } else {
                    rVar.U();
                }
                return zVar;
            case 1:
                m mVar2 = (m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue2 & 1, z3)) {
                    y.b((e) f2.f26168a.getValue(), context.getString(R.string.spread_duplicate), null, r.f19515d, rVar2, 3072, 4);
                } else {
                    rVar2.U();
                }
                return zVar;
            case 2:
                m mVar3 = (m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                r rVar3 = (r) mVar3;
                if (rVar3.R(intValue3 & 1, z3)) {
                    y.b(m9.a(), context.getString(R.string.spread_add), null, r.f19515d, rVar3, 3072, 4);
                } else {
                    rVar3.U();
                }
                return zVar;
            case 3:
                t9 t9Var = (t9) obj;
                String str = (String) obj2;
                t9Var.getClass();
                str.getClass();
                Set set = g0.f30195a;
                g0.c(context, "sticker:" + t9Var.f29155a.f29080a);
                n4.u1(context, t9Var);
                Toast.makeText(context, context.getString(R.string.sticker_pack_removed, str), 0).show();
                return zVar;
            case 4:
                t9 t9Var2 = (t9) obj;
                String str2 = (String) obj2;
                t9Var2.getClass();
                str2.getClass();
                Set set2 = g0.f30195a;
                g0.c(context, "sticker:" + t9Var2.f29155a.f29080a);
                n4.u1(context, t9Var2);
                Toast.makeText(context, context.getString(R.string.sticker_pack_removed, str2), 0).show();
                return zVar;
            default:
                t9 t9Var3 = (t9) obj;
                String str3 = (String) obj2;
                t9Var3.getClass();
                str3.getClass();
                Set set3 = g0.f30195a;
                g0.c(context, "sticker:" + t9Var3.f29155a.f29080a);
                n4.u1(context, t9Var3);
                Toast.makeText(context, context.getString(R.string.sticker_pack_removed, str3), 0).show();
                return zVar;
        }
    }
}

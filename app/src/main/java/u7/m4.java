package u7;
import j1.b;
import q.d;
import r0.a1;
import r0.e1;
import r0.f1;
import r0.m;
import r0.y;
import v1.t;
import w7.n4;
import w7.q4;
import w7.u4;
import x7.f0;
import z1.x;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26553u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f26554v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f26555w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26556x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26557y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26558z;

    public /* synthetic */ m4(Bitmap bitmap, x xVar, df.l lVar, df.l lVar2, df.a aVar, int i) {
        this.f26553u = 1;
        this.f26554v = bitmap;
        this.f26555w = xVar;
        this.f26556x = lVar;
        this.f26557y = lVar2;
        this.f26558z = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f26553u;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.f26558z;
        Object obj4 = this.f26557y;
        Object obj5 = this.f26556x;
        Object obj6 = this.f26555w;
        Object obj7 = this.f26554v;
        switch (i) {
            case 0:
                pf.z zVar2 = (pf.z) obj7;
                Context context = (Context) obj6;
                f1 f1Var = (f1) obj5;
                f1 f1Var2 = (f1) obj4;
                d dVar = (d) obj3;
                int intValue = ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                int intValue2 = num.intValue();
                f0.d();
                if (intValue2 > 0 && intValue >= 0) {
                    f1Var.i(intValue);
                    f1Var2.i(intValue);
                    pf.b0.x(zVar2, null, new y5(intValue, 3, dVar, null), 3);
                    Toast.makeText(context, context.getString(R.string.import_done, num), 0).show();
                }
                return zVar;
            case 1:
                ((Integer) obj2).getClass();
                n4.m0((Bitmap) obj7, (x) obj6, (df.l) obj5, (df.l) obj4, (df.a) obj3, (m) obj, y.L(28033));
                return zVar;
            default:
                u4 u4Var = (u4) obj6;
                a1 a1Var = (a1) obj4;
                t tVar = (t) obj;
                tVar.getClass();
                tVar.a();
                ((a1) obj5).setValue(Boolean.TRUE);
                float intBitsToFloat = Float.intBitsToFloat((int) (((b) a1Var.getValue()).f18762a & 4294967295L));
                long j10 = tVar.f27343c;
                ((e1) obj3).i(Float.intBitsToFloat((int) (4294967295L & j10)) + intBitsToFloat);
                ((df.l) obj7).invoke(new q4(null, u4Var.f29211c, u4Var.f29212d, b.h(((b) a1Var.getValue()).f18762a, j10), null, null, null, 240));
                return zVar;
        }
    }

    public /* synthetic */ m4(Object obj, Object obj2, a1 a1Var, a1 a1Var2, Object obj3, int i) {
        this.f26553u = i;
        this.f26554v = obj;
        this.f26555w = obj2;
        this.f26556x = a1Var;
        this.f26557y = a1Var2;
        this.f26558z = obj3;
    }
}

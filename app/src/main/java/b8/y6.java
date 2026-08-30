package b8;
import e7.o;
import s7.d;
import t7.a;
import t7.b;
import u7.f2;

import android.content.Context;
import android.widget.Toast;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class y6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3036u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f3037v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6(int i, Context context, te.c cVar) {
        super(2, cVar);
        this.f3036u = i;
        this.f3037v = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f3036u) {
            case 0:
                return new y6(0, this.f3037v, cVar);
            case 1:
                return new y6(1, this.f3037v, cVar);
            case 2:
                return new y6(2, this.f3037v, cVar);
            case 3:
                return new y6(3, this.f3037v, cVar);
            case 4:
                return new y6(4, this.f3037v, cVar);
            case 5:
                return new y6(5, this.f3037v, cVar);
            case 6:
                return new y6(6, this.f3037v, cVar);
            case 7:
                return new y6(7, this.f3037v, cVar);
            case 8:
                return new y6(8, this.f3037v, cVar);
            case 9:
                return new y6(9, this.f3037v, cVar);
            case 10:
                return new y6(10, this.f3037v, cVar);
            case 11:
                return new y6(11, this.f3037v, cVar);
            case 12:
                return new y6(12, this.f3037v, cVar);
            default:
                return new y6(13, this.f3037v, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f3036u) {
            case 0:
                y6 y6Var = (y6) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                y6Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                y6 y6Var2 = (y6) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                y6Var2.invokeSuspend(zVar3);
                return zVar3;
            case 2:
                y6 y6Var3 = (y6) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                y6Var3.invokeSuspend(zVar4);
                return zVar4;
            case 3:
                return ((y6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                y6 y6Var4 = (y6) create(zVar, cVar);
                pe.z zVar5 = pe.z.f22715a;
                y6Var4.invokeSuspend(zVar5);
                return zVar5;
            case 5:
                y6 y6Var5 = (y6) create(zVar, cVar);
                pe.z zVar6 = pe.z.f22715a;
                y6Var5.invokeSuspend(zVar6);
                return zVar6;
            case 6:
                y6 y6Var6 = (y6) create(zVar, cVar);
                pe.z zVar7 = pe.z.f22715a;
                y6Var6.invokeSuspend(zVar7);
                return zVar7;
            case 7:
                y6 y6Var7 = (y6) create(zVar, cVar);
                pe.z zVar8 = pe.z.f22715a;
                y6Var7.invokeSuspend(zVar8);
                return zVar8;
            case 8:
                y6 y6Var8 = (y6) create(zVar, cVar);
                pe.z zVar9 = pe.z.f22715a;
                y6Var8.invokeSuspend(zVar9);
                return zVar9;
            case 9:
                y6 y6Var9 = (y6) create(zVar, cVar);
                pe.z zVar10 = pe.z.f22715a;
                y6Var9.invokeSuspend(zVar10);
                return zVar10;
            case 10:
                y6 y6Var10 = (y6) create(zVar, cVar);
                pe.z zVar11 = pe.z.f22715a;
                y6Var10.invokeSuspend(zVar11);
                return zVar11;
            case 11:
                y6 y6Var11 = (y6) create(zVar, cVar);
                pe.z zVar12 = pe.z.f22715a;
                y6Var11.invokeSuspend(zVar12);
                return zVar12;
            case 12:
                return ((y6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((y6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3036u;
        pe.z zVar = pe.z.f22715a;
        Context context = this.f3037v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                s7 s7Var = s7.f2719a;
                d(context);
                return zVar;
            case 1:
                pe.a.e(obj);
                s7 s7Var2 = s7.f2719a;
                d(context);
                return zVar;
            case 2:
                pe.a.e(obj);
                o oVar = o.f15975a;
                o.d(context);
                return zVar;
            case 3:
                pe.a.e(obj);
                return f2.d(context, 50);
            case 4:
                pe.a.e(obj);
                Toast.makeText(context, R.string.export_saved, 0).show();
                sf.n0 n0Var = b.f25651a;
                b.c(context, a.NOTEBOOK_SAVED);
                return zVar;
            case 5:
                pe.a.e(obj);
                Toast.makeText(context, R.string.export_error, 0).show();
                return zVar;
            case 6:
                pe.a.e(obj);
                Toast.makeText(context, R.string.export_error, 0).show();
                return zVar;
            case 7:
                pe.a.e(obj);
                Toast.makeText(context, R.string.export_error, 0).show();
                return zVar;
            case 8:
                pe.a.e(obj);
                Toast.makeText(context, R.string.export_error, 0).show();
                return zVar;
            case 9:
                pe.a.e(obj);
                Toast.makeText(context, context.getString(R.string.export_failed), 0).show();
                return zVar;
            case 10:
                pe.a.e(obj);
                Toast.makeText(context, R.string.cover_image_error, 0).show();
                return zVar;
            case 11:
                pe.a.e(obj);
                sf.n0 n0Var2 = w7.o8.f28851a;
                w7.o8.a(context);
                return zVar;
            case 12:
                pe.a.e(obj);
                return f2.d(context, 40);
            default:
                pe.a.e(obj);
                return f2.d(context, 40);
        }
    }
}

package c2;
import j0.m;
import j1.b;
import k0.r;
import m2.g;
import r0.a1;
import r0.c0;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f3599v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(a1 a1Var, int i) {
        super(1);
        this.f3598u = i;
        this.f3599v = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        g gVar;
        int i = this.f3598u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f3599v;
        switch (i) {
            case 0:
                Configuration configuration = new Configuration((Configuration) obj);
                c0 c0Var = AndroidCompositionLocals_androidKt.f641a;
                a1Var.setValue(configuration);
                return zVar;
            case 1:
                m mVar = (m) obj;
                if (mVar.f18748c) {
                    gVar = mVar.f18747b;
                } else {
                    gVar = mVar.f18746a;
                }
                a1Var.setValue(gVar);
                return zVar;
            case 2:
                List list = (List) obj;
                if (a1Var != null) {
                    a1Var.setValue(list);
                }
                return zVar;
            case 3:
                ((df.l) a1Var.getValue()).invoke(new b(((b) obj).f18762a));
                return zVar;
            case 4:
                a1Var.setValue((r) obj);
                return zVar;
            default:
                return (Float) ((df.l) a1Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
        }
    }
}

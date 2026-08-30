package ig;

import com.google.android.gms.internal.mlkit_vision_digital_ink.br;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class t extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final br f18578w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f18579x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, br brVar) {
        super("OkHttp %s", new Object[]{uVar.d()});
        this.f18579x = uVar;
        this.f18578w = brVar;
    }

    @Override // jg.a
    public final void b() {
        boolean z3;
        IOException e;
        String str;
        this.f18579x.f18582w.j();
        try {
            try {
                w c10 = this.f18579x.c();
                boolean z9 = this.f18579x.f18581v.f20829d;
                br brVar = this.f18578w;
                z3 = true;
                try {
                    if (z9) {
                        brVar.a(new IOException("Canceled"));
                    } else {
                        brVar.b(c10);
                    }
                } catch (IOException e8) {
                    e = e8;
                    IOException e10 = this.f18579x.e(e);
                    if (z3) {
                        pg.h hVar = pg.h.f22833a;
                        u uVar = this.f18579x;
                        StringBuilder sb2 = new StringBuilder();
                        if (uVar.f18581v.f20829d) {
                            str = "canceled ";
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("call to ");
                        sb2.append(uVar.d());
                        hVar.l(4, "Callback failure for ".concat(sb2.toString()), e10);
                    } else {
                        this.f18579x.f18583x.getClass();
                        this.f18578w.a(e10);
                    }
                    nd.o oVar = this.f18579x.f18580u.f18564u;
                    oVar.i((ArrayDeque) oVar.f21272v, this);
                }
            } catch (Throwable th) {
                nd.o oVar2 = this.f18579x.f18580u.f18564u;
                oVar2.i((ArrayDeque) oVar2.f21272v, this);
                throw th;
            }
        } catch (IOException e11) {
            z3 = false;
            e = e11;
        }
        nd.o oVar3 = this.f18579x.f18580u.f18564u;
        oVar3.i((ArrayDeque) oVar3.f21272v, this);
    }
}

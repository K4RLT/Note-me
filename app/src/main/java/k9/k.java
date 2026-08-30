package k9;
import a0.k;
import i0.m;
import r.e;

import android.content.Context;
import com.google.android.gms.internal.ads.eb;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.sl;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: x, reason: collision with root package name */
    public final Context f19709x;

    public k(Context context, s6 s6Var) {
        super(s6Var);
        this.f19709x = context;
    }

    public static hb u(Context context) {
        hb hbVar = new hb(new rb(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new k(context, new s6(20)));
        hbVar.h();
        return hbVar;
    }

    @Override // m, com.google.android.gms.internal.ads.bb
    public final eb a(gb gbVar) {
        int i = gbVar.f6354v;
        String str = gbVar.f6355w;
        if (i == 0) {
            if (Pattern.matches((String) g9.e.f17698c.a(sl.f10904q5), str)) {
                l9.d dVar = g9.p.f17688g.f17689a;
                ca.f fVar = ca.f.f4036b;
                Context context = this.f19709x;
                if (fVar.c(context, 13400000) == 0) {
                    eb a10 = new ca.i(context, 1).a(gbVar);
                    if (a10 != null) {
                        a0.k("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return a10;
                    }
                    a0.k("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.a(gbVar);
    }
}

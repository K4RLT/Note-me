package f9;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.mw;
import com.google.android.gms.internal.ads.tu;
import java.util.Collections;
import java.util.List;
import k9.f0;
import k9.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16784a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16785b;

    /* renamed from: c, reason: collision with root package name */
    public final mw f16786c;

    /* renamed from: d, reason: collision with root package name */
    public final tu f16787d = new tu(Collections.EMPTY_LIST, false);

    public a(Context context, mw mwVar) {
        this.f16784a = context;
        this.f16786c = mwVar;
    }

    public final boolean a() {
        mw mwVar = this.f16786c;
        if (((mwVar != null && mwVar.f8443g.f8883z) || this.f16787d.f11447u) && !this.f16785b) {
            return false;
        }
        return true;
    }

    public final void b(String str) {
        List<String> list;
        tu tuVar = this.f16787d;
        mw mwVar = this.f16786c;
        if ((mwVar != null && mwVar.f8443g.f8883z) || tuVar.f11447u) {
            if (str == null) {
                str = "";
            }
            if (mwVar != null) {
                mwVar.b(str, null, 3);
                return;
            }
            if (tuVar.f11447u && (list = tuVar.f11448v) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        f0 f0Var = k.C.f16813c;
                        new u(this.f16784a, "", replace, null).r();
                    }
                }
            }
        }
    }
}

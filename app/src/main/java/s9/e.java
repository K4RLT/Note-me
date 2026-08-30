package s9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.f31;
import com.google.android.gms.internal.ads.j81;
import com.google.android.gms.internal.ads.nr;
import com.google.android.gms.internal.ads.wg0;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25057b;

    public /* synthetic */ e(int i, Object obj) {
        this.f25056a = i;
        this.f25057b = obj;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        switch (this.f25056a) {
            case 0:
                i iVar = (i) this.f25057b;
                return ed1.d0(iVar.B4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new nr(iVar, 2, (ArrayList) obj), iVar.A);
            case 1:
                i iVar2 = (i) this.f25057b;
                final Uri uri = (Uri) obj;
                return ed1.d0(iVar2.B4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new f31() { // from class: s9.f
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        if (!isEmpty) {
                            return i.C4(uri2, "nas", str);
                        }
                        return uri2;
                    }
                }, iVar2.A);
            default:
                wg0 wg0Var = (wg0) obj;
                m mVar = new m(new JsonReader(new InputStreamReader(wg0Var.f12238a)), wg0Var.f12239b);
                try {
                    mVar.f25084b = g9.p.f17688g.f17689a.m(((dv) this.f25057b).f5526u).toString();
                } catch (JSONException unused) {
                    mVar.f25084b = "{}";
                }
                return ed1.e(mVar);
        }
    }
}

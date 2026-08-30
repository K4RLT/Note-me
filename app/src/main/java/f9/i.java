package f9;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.km;
import g9.n;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f16804a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        j jVar = this.f16804a;
        jVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) km.f7805d.p());
        n nVar = jVar.f16808x;
        String str = (String) nVar.f17681y;
        if (str != null) {
            builder.appendQueryParameter("query", str);
        }
        builder.appendQueryParameter("pubId", (String) nVar.f17679w);
        builder.appendQueryParameter("mappver", (String) nVar.A);
        TreeMap treeMap = (TreeMap) nVar.f17680x;
        for (String str2 : treeMap.keySet()) {
            builder.appendQueryParameter(str2, (String) treeMap.get(str2));
        }
        Uri build = builder.build();
        String w42 = jVar.w4();
        String encodedQuery = build.getEncodedQuery();
        return p.a.o(new StringBuilder(w42.length() + 1 + String.valueOf(encodedQuery).length()), w42, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f16804a.f16809y;
        String str = (String) obj;
        if (webView != null && str != null) {
            webView.loadUrl(str);
        }
    }
}

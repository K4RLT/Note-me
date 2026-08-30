package y5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import g5.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import z5.k;
import z5.l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30913a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static t.a b(WebView webView) {
        return new t.a(13, l.f31931a.createWebView(webView));
    }

    public static String c() {
        if (k.f31928f.b()) {
            return l.f31931a.getStatics().getVariationsHeader();
        }
        throw k.a();
    }

    public static WebViewClient d(WebView webView) {
        Looper webViewLooper;
        WebViewClient webViewClient;
        z5.b bVar = k.f31925b;
        if (bVar.a()) {
            webViewClient = webView.getWebViewClient();
            return webViewClient;
        }
        if (bVar.b()) {
            if (Build.VERSION.SDK_INT >= 28) {
                webViewLooper = webView.getWebViewLooper();
                if (webViewLooper != Looper.myLooper()) {
                    StringBuilder sb2 = new StringBuilder("A WebView method was called on thread '");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
                    sb2.append(webViewLooper);
                    sb2.append(" called on ");
                    sb2.append(Looper.myLooper());
                    Looper mainLooper = Looper.getMainLooper();
                    sb2.append(", FYI main Looper is ");
                    sb2.append(mainLooper);
                    sb2.append(")");
                    throw new RuntimeException(sb2.toString());
                }
            } else {
                try {
                    Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(webView, null);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    q.k(e);
                    return null;
                }
            }
            return ((WebViewProviderBoundaryInterface) b(webView).f25315v).getWebViewClient();
        }
        throw k.a();
    }
}

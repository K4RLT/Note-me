package z5;
import b.a;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f31923d;

    public i() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f31923d = Pattern.compile("\\A\\d+");
    }

    @Override // z5.c
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override // z5.c
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (b10 && (i = Build.VERSION.SDK_INT) < 29) {
            int i10 = y5.b.f30913a;
            if (i >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                try {
                    packageInfo = y5.a();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.f31923d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b10;
    }
}

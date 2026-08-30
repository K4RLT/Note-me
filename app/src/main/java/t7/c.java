package t7;
import b.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.daren.scraply.R;
import pe.j;
import pe.z;
import u7.f2;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25658u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f25659v;

    public /* synthetic */ c(Context context, int i) {
        this.f25658u = i;
        this.f25659v = context;
    }

    @Override // df.a
    public final Object invoke() {
        j jVar;
        String valueOf;
        long longVersionCode;
        int i = this.f25658u;
        z zVar = z.f22715a;
        Context context = this.f25659v;
        switch (i) {
            case 0:
                b.e(context);
                return zVar;
            case 1:
                b.e(context);
                f2.h(context);
                return zVar;
            case 2:
                b.e(context);
                return zVar;
            case 3:
                f2.h(context);
                return zVar;
            case 4:
                b(context);
                return zVar;
            default:
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageInfo.getLongVersionCode();
                        valueOf = String.valueOf(longVersionCode);
                    } else {
                        valueOf = String.valueOf(packageInfo.versionCode);
                    }
                    String str = packageInfo.versionName;
                    if (str == null) {
                        str = "?";
                    }
                    jVar = new j(str, valueOf);
                } catch (Exception unused) {
                    jVar = new j("?", "?");
                }
                String str2 = (String) jVar.f22693u;
                String str3 = (String) jVar.f22694v;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(context.getString(R.string.support_body_hint));
                sb2.append("\n\n\n\n\n――――――――――――――――――――\n");
                sb2.append(context.getString(R.string.feedback_tech_header));
                sb2.append('\n');
                sb2.append("Scraply " + str2 + " (" + str3 + ")\n");
                sb2.append(Build.MANUFACTURER + " " + Build.MODEL + "\n");
                sb2.append("Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")");
                String sb3 = sb2.toString();
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"apis.revisor@gmail.com"});
                intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.support_subject));
                intent.putExtra("android.intent.extra.TEXT", sb3);
                try {
                    context.startActivity(intent);
                } catch (Exception unused2) {
                    Toast.makeText(context, R.string.feedback_no_email_app, 0).show();
                }
                return zVar;
        }
    }
}

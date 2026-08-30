package fa;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class q implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f16910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16911c;

    public /* synthetic */ q(Intent intent, Object obj, int i) {
        this.f16909a = i;
        this.f16910b = intent;
        this.f16911c = obj;
    }

    public final void a() {
        switch (this.f16909a) {
            case 0:
                Intent intent = this.f16910b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f16911c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f16910b;
                if (intent2 != null) {
                    ((ea.x) this.f16911c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}

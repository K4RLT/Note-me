package eb;

import android.accounts.AccountManager;
import com.google.android.gms.internal.ads.wd0;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n extends k1 {
    public Boolean A;
    public long B;

    /* renamed from: x, reason: collision with root package name */
    public long f16246x;

    /* renamed from: y, reason: collision with root package name */
    public String f16247y;

    /* renamed from: z, reason: collision with root package name */
    public AccountManager f16248z;

    @Override // eb.k1
    public final boolean x() {
        Calendar calendar = Calendar.getInstance();
        this.f16246x = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f16247y = wd0.n(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long y() {
        v();
        return this.f16246x;
    }

    public final String z() {
        v();
        return this.f16247y;
    }
}

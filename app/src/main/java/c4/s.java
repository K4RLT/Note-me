package c4;
import p.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import java.util.IllegalFormatException;
import java.util.Locale;
import w7.i1;
import xa.c1;

/* loaded from: classes.dex */
public final class s implements q, l9.e, za.c, c1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3856u;

    /* renamed from: v, reason: collision with root package name */
    public String f3857v;

    public s(String str) {
        this.f3856u = 4;
        this.f3857v = g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat(str);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = i1.d(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return wd0.n(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", b(this.f3857v, str, objArr));
        }
    }

    @Override // l9.e
    public /* synthetic */ void c(JsonWriter jsonWriter) {
        Object obj = l9.f.f20042b;
        jsonWriter.name("params").beginObject();
        String str = this.f3857v;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    @Override // c4.q
    public boolean e(CharSequence charSequence, int i, int i10, z zVar) {
        if (TextUtils.equals(charSequence.subSequence(i, i10), this.f3857v)) {
            zVar.f3880c = (zVar.f3880c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f3856u) {
            case 8:
                return a.n(new StringBuilder("<"), this.f3857v, '>');
            default:
                return super.toString();
        }
    }

    @Override // za.c
    public Object zza() {
        switch (this.f3856u) {
            case 6:
                HandlerThread handlerThread = new HandlerThread(this.f3857v, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 9:
                throw new ab.b(this.f3857v, 21);
            default:
                throw new ab.b(this.f3857v, 21);
        }
    }

    @Override // c4.q
    public Object getResult() {
        return this;
    }

    public /* synthetic */ s(c7.a aVar) {
        this.f3856u = 2;
        this.f3857v = aVar.f3896v;
    }

    public /* synthetic */ s(c7.a aVar, byte b10) {
        this.f3856u = 7;
        this.f3857v = aVar.f3896v;
    }

    public /* synthetic */ s(String str, int i) {
        this.f3856u = i;
        this.f3857v = str;
    }
}

package ic;
import c.a;
import d.d;
import n.e;
import n.f;
import q.h;
import q.l;
import q.q;
import q.r;

import android.R;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.i81;
import com.google.android.gms.internal.ads.x90;
import j.i0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lb.u;
import n9.t;
import org.json.JSONArray;
import org.json.JSONException;
import q.a0;
import q.b0;
import ya.m9;

/* loaded from: classes.dex */
public class c implements MediaViewListener, ea.h, kb.c, l9.e, u, mb.f, mc.a, ib.a, r, q5.d, i81 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18392u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18393v;

    public c(int i) {
        Object obj;
        this.f18392u = i;
        switch (i) {
            case 17:
                this.f18393v = new LinkedHashMap(0, 0.75f, true);
                return;
            case 18:
                new f(0);
                this.f18393v = new HashMap();
                return;
            case 22:
                if (Build.VERSION.SDK_INT >= 28) {
                    obj = new Object();
                } else {
                    obj = new Object();
                }
                this.f18393v = obj;
                return;
            case 27:
                this.f18393v = null;
                return;
            default:
                this.f18393v = new ConcurrentHashMap();
                new AtomicInteger(0);
                return;
        }
    }

    public static String E(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean x(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.e")) && !"1".equals(bundle.getString("gcm.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public void A(float f10, float f11, long j10) {
        k1.p j11 = ((i0) this.f18393v).j();
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        j11.q(Float.intBitsToFloat(i), Float.intBitsToFloat(i10));
        j11.d(f10, f11);
        j11.q(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i10));
    }

    public void B(boolean z3) {
        e4.e eVar = (e4.e) ((x90) ((z5.h) this.f18393v).f31922v).f12503w;
        if (eVar.f15910w != z3) {
            if (eVar.f15909v != null) {
                c4.k a10 = c4.a();
                e4.d dVar = eVar.f15909v;
                a10.getClass();
                m9.a(dVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f3841a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f3842b.remove(dVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            eVar.f15910w = z3;
            if (z3) {
                e4.e.a(eVar.f15908u, c4.a().c());
            }
        }
    }

    public void C() {
        View view;
        View view2 = (View) this.f18393v;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new a6.e(24, view));
            }
        }
    }

    public void D(float f10, float f11) {
        ((i0) this.f18393v).j().q(f10, f11);
    }

    public void F(ImageView.ScaleType scaleType) {
        eo eoVar = ((q9.e) this.f18393v).f23619v;
        if (eoVar != null && scaleType != null) {
            try {
                eoVar.M2(new oa.b(scaleType));
            } catch (RemoteException e) {
                l9.i.d("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.n(r5) != null) goto L17;
     */
    @Override // lb.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18393v
            lb.r1 r0 = (lb.r1) r0
            lb.v r0 = r0.f20250a
            r0.getClass()
            r1 = 4
            java.lang.String r2 = r0.n(r5)     // Catch: java.io.IOException -> L11
            if (r2 == 0) goto L11
            goto L13
        L11:
            if (r4 == r1) goto L1d
        L13:
            java.lang.String r5 = r0.n(r5)     // Catch: java.io.IOException -> L1f
            if (r5 == 0) goto L1f
            if (r4 == r1) goto L1f
            r4 = r1
            goto L1f
        L1d:
            r4 = 8
        L1f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a(int, java.lang.String):int");
    }

    @Override // ea.h
    public void accept(Object obj, Object obj2) {
        ja.e eVar = new ja.e((ib.h) obj2, 0);
        ja.d dVar = (ja.d) ((ja.g) obj).t();
        ja.a aVar = (ja.a) this.f18393v;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(dVar.f9121w);
        int i = sa.a.f25125a;
        obtain.writeStrongBinder(eVar);
        sa.a.c(obtain, aVar);
        dVar.M0(obtain, 1);
    }

    @Override // mb.f
    public Object b() {
        mb.e eVar = (mb.e) this.f18393v;
        if (eVar != null) {
            return eVar.b();
        }
        g5.l();
        return null;
    }

    @Override // l9.e
    public void c(JsonWriter jsonWriter) {
        Object obj = l9.f.f20042b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f18393v;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String d2 = l9.d(encodeToString, "MD5");
            if (d2 != null) {
                jsonWriter.name("bodydigest").value(d2);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public void d(k1.i0 i0Var, int i) {
        ((i0) this.f18393v).j().o(i0Var, i);
    }

    public void e(float f10, float f11, float f12, float f13, int i) {
        ((i0) this.f18393v).j().p(f10, f11, f12, f13, i);
    }

    @Override // q5.d
    public void f(q5.c cVar) {
        s5.e eVar = (s5.e) this.f18393v;
        int length = eVar.f24920x.length;
        for (int i = 1; i < length; i++) {
            int i10 = eVar.f24920x[i];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                cVar.g(i);
                            }
                        } else {
                            byte[] bArr = eVar.B[i];
                            bArr.getClass();
                            cVar.z(bArr, i);
                        }
                    } else {
                        String str = eVar.A[i];
                        str.getClass();
                        cVar.n(i, str);
                    }
                } else {
                    cVar.c(eVar.f24922z[i], i);
                }
            } else {
                cVar.b(i, eVar.f24921y[i]);
            }
        }
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        return ((Callable) this.f18393v).call();
    }

    @Override // r
    public a0 get(int i) {
        switch (this.f18392u) {
            case 20:
                return ((b0[]) this.f18393v)[i];
            default:
                return (a0) this.f18393v;
        }
    }

    public void h() {
        ((r0.u) this.f18393v).getClass();
    }

    public boolean i(String str) {
        String t3 = t(str);
        if (!"1".equals(t3) && !Boolean.parseBoolean(t3)) {
            return false;
        }
        return true;
    }

    @Override // q5.d
    public String j() {
        return ((s5.e) this.f18393v).f24924v;
    }

    @Override // mc.a
    public void k(Bundle bundle) {
        ((fc.c) ((fc.b) this.f18393v)).a("clx", bundle, "_ae");
    }

    public Integer l(String str) {
        String t3 = t(str);
        if (!TextUtils.isEmpty(t3)) {
            try {
                return Integer.valueOf(Integer.parseInt(t3));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + E(str) + "(" + t3 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray m(String str) {
        String t3 = t(str);
        if (!TextUtils.isEmpty(t3)) {
            try {
                return new JSONArray(t3);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + E(str) + ": " + t3 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public KeyListener n(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((x90) ((z5.h) this.f18393v).f31922v).getClass();
            if (keyListener instanceof e4.c) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e4.c(keyListener);
        }
        return keyListener;
    }

    public int[] o() {
        JSONArray m4 = m("gcm.n.light_settings");
        if (m4 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m4.length() == 3) {
                int parseColor = Color.parseColor(m4.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = m4.optInt(1);
                    iArr[2] = m4.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m4 + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m4 + ". Skipping setting LightSettings");
            return null;
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onComplete(MediaView mediaView) {
        t tVar = ((j8.e) this.f18393v).f19051l;
        if (tVar != null) {
            tVar.c();
        }
    }

    public Object[] p(String str) {
        JSONArray m4 = m(str.concat("_loc_args"));
        if (m4 == null) {
            return null;
        }
        int length = m4.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m4.optString(i);
        }
        return strArr;
    }

    public String q(String str) {
        return t(str.concat("_loc_key"));
    }

    public Long r() {
        String t3 = t("gcm.n.event_time");
        if (!TextUtils.isEmpty(t3)) {
            try {
                return Long.valueOf(Long.parseLong(t3));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + E("gcm.n.event_time") + "(" + t3 + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String s(Resources resources, String str, String str2) {
        String t3 = t(str2);
        if (!TextUtils.isEmpty(t3)) {
            return t3;
        }
        String q10 = q(str2);
        if (TextUtils.isEmpty(q10)) {
            return null;
        }
        int identifier = resources.getIdentifier(q10, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", E(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] p10 = p(str2);
        if (p10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, p10);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + E(str2) + ": " + Arrays.toString(p10) + " Default value will be used.", e);
            return null;
        }
    }

    public String t(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f18393v;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long[] u() {
        JSONArray m4 = m("gcm.n.vibrate_timings");
        if (m4 == null) {
            return null;
        }
        try {
            if (m4.length() > 1) {
                int length = m4.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = m4.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m4 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void v() {
        View view = (View) this.f18393v;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void w(float f10, float f11, float f12, float f13) {
        i0 i0Var = (i0) this.f18393v;
        k1.p j10 = i0Var.j();
        float intBitsToFloat = Float.intBitsToFloat((int) (i0Var.r() >> 32)) - (f12 + f10);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (i0Var.r() & 4294967295L)) - (f13 + f11);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            k1.b0.a("Width and height must be greater than or equal to zero");
        }
        i0Var.I(floatToRawIntBits);
        j10.q(f10, f11);
    }

    public Bundle y() {
        Bundle bundle = (Bundle) this.f18393v;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void z(long j10, float f10) {
        k1.p j11 = ((i0) this.f18393v).j();
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        j11.q(Float.intBitsToFloat(i), Float.intBitsToFloat(i10));
        j11.h(f10);
        j11.q(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i10));
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public ac.b mo207zza() {
        s9.i iVar = (s9.i) this.f18393v;
        try {
            return (ac.b) iVar.A4(iVar.f25071w, null, "BANNER", null, null, new Bundle()).f7923b.zzb();
        } catch (NullPointerException e) {
            return ed1.A(e);
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPlay(MediaView mediaView) {
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public Object mo207zza() {
        jb.e eVar = (jb.e) ((kb.c) this.f18393v).mo207zza();
        if (eVar != null) {
            return eVar;
        }
        g5.h("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onVolumeChange(MediaView mediaView, float f10) {
    }

    public /* synthetic */ c(int i, boolean z3) {
        this.f18392u = i;
    }

    public /* synthetic */ c(ja.f fVar, ja.a aVar) {
        this.f18392u = 3;
        this.f18393v = aVar;
    }

    public /* synthetic */ c(int i, Object obj) {
        this.f18392u = i;
        this.f18393v = obj;
    }

    public c(a aVar) {
        this.f18392u = 1;
        this.f18393v = new z5.h(aVar);
    }

    public c(Bundle bundle) {
        this.f18392u = 16;
        if (bundle != null) {
            this.f18393v = new Bundle(bundle);
        } else {
            g5.h("data");
            throw null;
        }
    }

    public c(float f10, float f11, q qVar) {
        this.f18392u = 20;
        int b10 = qVar.b();
        b0[] b0VarArr = new b0[b10];
        for (int i = 0; i < b10; i++) {
            b0VarArr[i] = new b0(f10, f11, qVar.a(i));
        }
        this.f18393v = b0VarArr;
    }
}

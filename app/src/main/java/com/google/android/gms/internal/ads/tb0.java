package com.google.android.gms.internal.ads;
import g3.a;
import g9.r;
import k9.a0;
import k9.r;
import la.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tb0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f11304a;

    /* renamed from: b, reason: collision with root package name */
    public final a f11305b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11306c;

    public tb0(r rVar, a aVar, wx wxVar) {
        this.f11304a = rVar;
        this.f11305b = aVar;
        this.f11306c = wxVar;
    }

    public final Bitmap a(byte[] bArr, double d2, boolean z3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z3) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        nl nlVar = sl.f10650a7;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            b(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) rVar.f17698c.a(sl.f10666b7)).intValue())) / 2);
            }
        }
        return b(bArr, options);
    }

    public final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        this.f11305b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j10 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z3 = true;
            }
            int length = String.valueOf(width).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + length + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z3).length());
            a.r(width, height, "Decoded image w: ", " h:", sb2);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z3);
            a0.k(sb2.toString());
        }
        return decodeByteArray;
    }
}

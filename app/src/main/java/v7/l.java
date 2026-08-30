package v7;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import u7.b8;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f27450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27451b;

    /* renamed from: c, reason: collision with root package name */
    public List f27452c;

    /* renamed from: d, reason: collision with root package name */
    public List f27453d;
    public List e;

    /* renamed from: f, reason: collision with root package name */
    public List f27454f;

    /* renamed from: g, reason: collision with root package name */
    public b8 f27455g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f27456h;
    public Integer i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f27457j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f27458k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27459l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27460m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f27461n;

    public l(String str, int i) {
        this.f27450a = str;
        this.f27451b = i;
    }

    public final boolean a() {
        if (!b() && this.f27457j == null && this.f27458k == null && !this.f27459l && !this.f27460m) {
            ArrayList arrayList = this.f27461n;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean b() {
        if (this.f27452c == null && this.f27453d == null && this.e == null && this.f27454f == null && this.f27455g == null && this.f27456h == null) {
            return false;
        }
        return true;
    }

    public final int c() {
        int i;
        int allocationByteCount;
        Bitmap bitmap = this.f27457j;
        if (bitmap != null && !bitmap.isRecycled()) {
            i = bitmap.getAllocationByteCount();
        } else {
            i = 0;
        }
        Bitmap bitmap2 = this.f27458k;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            i += bitmap2.getAllocationByteCount();
        }
        ArrayList arrayList = this.f27461n;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Bitmap bitmap3 = ((g) obj).f27428d;
                if (bitmap3.isRecycled()) {
                    allocationByteCount = 0;
                } else {
                    allocationByteCount = bitmap3.getAllocationByteCount();
                }
                i += allocationByteCount;
            }
        }
        return i;
    }

    public final void d() {
        Bitmap bitmap = this.f27457j;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.f27458k;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f27457j = null;
        this.f27458k = null;
        int i = 0;
        this.f27459l = false;
        this.f27460m = false;
        ArrayList arrayList = this.f27461n;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Bitmap bitmap3 = ((g) obj).f27428d;
                if (!bitmap3.isRecycled()) {
                    bitmap3.recycle();
                }
            }
        }
        this.f27461n = null;
    }
}

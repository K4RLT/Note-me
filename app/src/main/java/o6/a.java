package o6;
import d.a;
import l.c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import n.q;
import n.s0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f21786c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f21787d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f21788f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f21789g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f21790h;
    public q i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f21791j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f21792k;

    /* renamed from: l, reason: collision with root package name */
    public float f21793l;

    /* renamed from: m, reason: collision with root package name */
    public float f21794m;

    /* renamed from: n, reason: collision with root package name */
    public float f21795n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21796o;

    /* renamed from: a, reason: collision with root package name */
    public final ic.c f21784a = new ic.c(18);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21785b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f21797p = 0;

    public final void a(String str) {
        a7.d.a(str);
        this.f21785b.add(str);
    }

    public final float b() {
        return ((this.f21794m - this.f21793l) / this.f21795n) * 1000.0f;
    }

    public final Map c() {
        float c10 = a7.c();
        if (c10 != this.e) {
            for (Map.Entry entry : this.f21787d.entrySet()) {
                HashMap hashMap = this.f21787d;
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                float f10 = this.e / c10;
                int i = (int) (lVar.f21827a * f10);
                int i10 = (int) (lVar.f21828b * f10);
                l lVar2 = new l(lVar.f21829c, i, lVar.f21830d, lVar.e, i10);
                Bitmap bitmap = lVar.f21831f;
                if (bitmap != null) {
                    lVar2.f21831f = Bitmap.createScaledBitmap(bitmap, i, i10, true);
                }
                hashMap.put(str, lVar2);
            }
        }
        this.e = c10;
        return this.f21787d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.f21791j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb2.append(((x6.e) obj).a("\t"));
        }
        return sb2.toString();
    }
}

package j;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f18639a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f18640b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f18641c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f18642d = -1.0f;
    public int[] e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f18643f = false;

    /* renamed from: g, reason: collision with root package name */
    public final a f18644g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f18645h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public j(a aVar) {
        this.f18644g = aVar;
        this.f18645h = aVar.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new h();
        } else {
            new g();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }
}

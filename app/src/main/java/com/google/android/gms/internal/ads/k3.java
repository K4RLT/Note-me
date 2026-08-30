package com.google.android.gms.internal.ads;
import p4.b;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d71 f7635a = new d71(3, new int[]{0, 2, 1});

    /* renamed from: b, reason: collision with root package name */
    public static final d71 f7636b = new d71(5, new int[]{0, 2, 1, 3, 4});

    /* renamed from: c, reason: collision with root package name */
    public static final d71 f7637c = new d71(6, new int[]{0, 2, 1, 5, 3, 4});

    /* renamed from: d, reason: collision with root package name */
    public static final d71 f7638d;
    public static final d71 e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        f7638d = new d71(7, iArr);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        e = new d71(8, iArr2);
    }

    public static m8 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = bq0.f4860a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                x21.F("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(b(new xk0(Base64.decode(split[1], 0))));
                } catch (RuntimeException e8) {
                    x21.K("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new i5(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m8(arrayList);
    }
}

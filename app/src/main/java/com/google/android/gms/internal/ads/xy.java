package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class xy implements q2 {
    public static final di A;
    public static final q90 C;
    public static final /* synthetic */ int N = 0;
    public static final /* synthetic */ int O = 0;

    /* renamed from: v, reason: collision with root package name */
    public static AudioManager f12658v;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12663u;

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f12659w = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f12660x = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f12661y = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f12662z = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static final di B = new di(16);
    public static final q90 D = new q90(13);
    public static final q90 E = new q90(20);
    public static final q90 F = new q90(28);
    public static final bn0 G = new bn0(8);
    public static final bn0 H = new bn0(14);
    public static final byte[] I = {0, 0, 0, 1};
    public static final float[] J = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object K = new Object();
    public static int[] L = new int[10];
    public static final ck1 M = new ck1(29);

    static {
        int i = 1;
        A = new di(i);
        C = new q90(i);
    }

    public /* synthetic */ xy(int i) {
        this.f12663u = i;
    }

    public static long[] A(long[]... jArr) {
        boolean z3;
        long j10 = 0;
        for (long[] jArr2 : jArr) {
            j10 += jArr2.length;
        }
        int i = (int) j10;
        if (j10 == i) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.G(j10, "the total number of elements (%s) in the arrays must fit in an int", z3);
        long[] jArr3 = new long[i];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            int length = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i10, length);
            i10 += length;
        }
        return jArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.q5 C(com.google.android.gms.internal.ads.tk0 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy.C(com.google.android.gms.internal.ads.tk0, boolean):com.google.android.gms.internal.ads.q5");
    }

    public static h61 D(Set set, i31 i31Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (set2 instanceof h61) {
                h61 h61Var = (h61) set2;
                i31 i31Var2 = h61Var.f6614v;
                i31Var2.getClass();
                return new h61((SortedSet) h61Var.f6613u, new j31(Arrays.asList(i31Var2, i31Var)));
            }
            return new h61(set2, i31Var);
        }
        if (set instanceof h61) {
            h61 h61Var2 = (h61) set;
            i31 i31Var3 = h61Var2.f6614v;
            i31Var3.getClass();
            return new h61(h61Var2.f6613u, new j31(Arrays.asList(i31Var3, i31Var)));
        }
        set.getClass();
        return new h61(set, i31Var);
    }

    public static boolean G(JSONArray jSONArray, String str) {
        Pattern compile;
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10894pc)).booleanValue()) {
                        compile = Pattern.compile(optString, 2);
                    } else {
                        compile = Pattern.compile(optString);
                    }
                } catch (PatternSyntaxException e) {
                    f9.k.C.f16817h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e);
                }
                if (compile.matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final byte[] H(int i, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 >= i) {
            byte[] bArr3 = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArr3[i10] = (byte) (bArr[i10 + i] ^ bArr2[i10]);
            }
            return bArr3;
        }
        q.x.n("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] I(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy.I(java.lang.String, boolean):java.lang.String[]");
    }

    public static int J(mw1 mw1Var) {
        String f02 = f0(mw1Var);
        if (Objects.equals(f02, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(f02, "video/hevc") && !Objects.equals(f02, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static int K(Set set) {
        int i;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i10 += i;
        }
        return i10;
    }

    public static void L(tk0 tk0Var) {
        int i;
        int h3;
        int h10 = tk0Var.h(2);
        int i10 = 6;
        if (h10 == 0) {
            tk0Var.f(6);
            return;
        }
        int i11 = 5;
        int U = U(tk0Var, 5, 8, 16) + 1;
        if (h10 == 1) {
            tk0Var.f(U * 7);
            return;
        }
        if (h10 == 2) {
            boolean g8 = tk0Var.g();
            if (true != g8) {
                i = 5;
            } else {
                i = 1;
            }
            if (true == g8) {
                i11 = 7;
            }
            if (true == g8) {
                i10 = 8;
            }
            int i12 = 0;
            while (i12 < U) {
                if (tk0Var.g()) {
                    tk0Var.f(7);
                    h3 = 0;
                } else {
                    if (tk0Var.h(2) == 3 && tk0Var.h(i11) * i != 0) {
                        tk0Var.e();
                    }
                    h3 = tk0Var.h(i10) * i;
                    if (h3 != 0 && h3 != 180) {
                        tk0Var.e();
                    }
                    tk0Var.e();
                }
                if (h3 != 0 && h3 != 180 && tk0Var.g()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    public static final void M(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i && byteBuffer.remaining() >= i) {
            for (int i10 = 0; i10 < i; i10++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        q.x.n("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static int N(tk0 tk0Var) {
        int h3 = tk0Var.h(4);
        if (h3 == 15) {
            if (tk0Var.b() >= 24) {
                return tk0Var.h(24);
            }
            throw va.a(null, "AAC header insufficient data");
        }
        if (h3 < 13) {
            return f12659w[h3];
        }
        throw va.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static c0 O(int i, o2 o2Var, xk0 xk0Var) {
        c0 a10 = c0.a(o2Var, xk0Var);
        while (true) {
            int i10 = a10.f4929u;
            if (i10 != i) {
                a5.a.t(new StringBuilder(String.valueOf(i10).length() + 28), "Ignoring unknown WAV chunk: ", i10, "WavHeaderReader");
                long j10 = a10.f4930v;
                long j11 = 8 + j10;
                if ((1 & j10) != 0) {
                    j11 = 9 + j10;
                }
                if (j11 <= 2147483647L) {
                    o2Var.u((int) j11);
                    a10 = c0.a(o2Var, xk0Var);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(i10);
                    throw va.b(sb2.toString());
                }
            } else {
                return a10;
            }
        }
    }

    public static boolean P(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean Q(byte[] bArr, int i, mw1 mw1Var) {
        int i10;
        String str = mw1Var.f8459o;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i10 = b10 & 31) == 1 || i10 == 9 || i10 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            x0 c02 = c0(new a2(bArr, 4, i + 4));
            int i11 = c02.f12384a;
            if (i11 != 35) {
                if (i11 <= 14 && i11 % 2 == 0 && c02.f12386c == mw1Var.G - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static Pair R(RandomAccessFile randomAccessFile, int i) {
        int i10;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            W(allocate);
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i11 = capacity2 - 22;
                int min = Math.min(i11, 65535);
                for (int i12 = 0; i12 < min; i12++) {
                    i10 = i11 - i12;
                    if (allocate.getInt(i10) == 101010256 && ((char) allocate.getShort(i10 + 20)) == i12) {
                        break;
                    }
                }
            }
            i10 = -1;
            if (i10 != -1) {
                allocate.position(i10);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + i10));
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.v11 S(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy.S(byte[], int, int):com.google.android.gms.internal.ads.v11");
    }

    public static void T(tk0 tk0Var) {
        tk0Var.f(3);
        tk0Var.f(8);
        boolean g8 = tk0Var.g();
        boolean g10 = tk0Var.g();
        if (g8) {
            tk0Var.f(5);
        }
        if (g10) {
            tk0Var.f(6);
        }
    }

    public static int U(tk0 tk0Var, int i, int i10, int i11) {
        boolean z3;
        if (Math.max(Math.max(i, i10), i11) <= 31) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        int i12 = (1 << i) - 1;
        int i13 = (1 << i10) - 1;
        Math.addExact(Math.addExact(i12, i13), 1 << i11);
        if (tk0Var.b() >= i) {
            int h3 = tk0Var.h(i);
            if (h3 == i12) {
                if (tk0Var.b() >= i10) {
                    int h10 = tk0Var.h(i10);
                    h3 += h10;
                    if (h10 == i13) {
                        if (tk0Var.b() >= i11) {
                            return tk0Var.h(i11) + h3;
                        }
                    }
                }
            }
            return h3;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Type inference failed for: r9v26, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.tw V(byte[] r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy.V(byte[], int, int):com.google.android.gms.internal.ads.tw");
    }

    public static void W(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        q.x.n("ByteBuffer byte order must be little endian");
    }

    public static boolean X(j61 j61Var, Collection collection) {
        collection.getClass();
        if (collection instanceof v51) {
            collection = ((v51) collection).zza();
        }
        boolean z3 = false;
        if ((collection instanceof Set) && collection.size() > j61Var.size()) {
            Iterator<E> it = j61Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z3 = true;
                }
            }
            return z3;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z3 |= j61Var.remove(it2.next());
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.h01 Y(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.tw r35) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy.Y(byte[], int, int, com.google.android.gms.internal.ads.tw):com.google.android.gms.internal.ads.h01");
    }

    public static int Z(byte[] bArr, int i, int i10, boolean[] zArr) {
        boolean z3;
        boolean z9;
        boolean z10;
        int i11 = i10 - i;
        boolean z11 = false;
        if (i11 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a0(zArr);
            return i - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i] == 1) {
            a0(zArr);
            return i - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a0(zArr);
            return i - 1;
        }
        int i12 = i10 - 1;
        int i13 = i + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    a0(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        if (i11 <= 2 ? !(i11 != 2 ? !zArr[1] || bArr[i12] != 1 : !zArr[2] || bArr[i10 - 2] != 0 || bArr[i12] != 1) : !(bArr[i10 - 3] != 0 || bArr[i10 - 2] != 0 || bArr[i12] != 1)) {
            z9 = true;
        } else {
            z9 = false;
        }
        zArr[0] = z9;
        if (i11 <= 1 ? !(!zArr[2] || bArr[i12] != 0) : !(bArr[i10 - 2] != 0 || bArr[i12] != 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[1] = z10;
        if (bArr[i12] == 0) {
            z11 = true;
        }
        zArr[2] = z11;
        return i10;
    }

    public static void a0(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String b0(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                b51 b51Var = d51.f5314v;
                ed1.u(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i10 >= length2) {
                        break;
                    }
                    int Z = Z(bArr, i10, length2, zArr);
                    if (Z != length2) {
                        Integer valueOf = Integer.valueOf(Z);
                        int length3 = objArr.length;
                        int i12 = i11 + 1;
                        int d2 = y41.d(length3, i12);
                        if (d2 > length3) {
                            objArr = Arrays.copyOf(objArr, d2);
                        }
                        objArr[i11] = valueOf;
                        i11 = i12;
                    }
                    i10 = Z + 3;
                }
                y51 w10 = d51.w(objArr, i11);
                for (int i13 = 0; i13 < w10.f12783x; i13++) {
                    if (((Integer) w10.get(i13)).intValue() + 3 < length) {
                        a2 a2Var = new a2(bArr, ((Integer) w10.get(i13)).intValue() + 3, length);
                        x0 c02 = c0(a2Var);
                        if (c02.f12384a == 33 && c02.f12385b == 0) {
                            a2Var.m(4);
                            int p10 = a2Var.p(3);
                            a2Var.k();
                            jy0 d02 = d0(a2Var, true, p10, null);
                            return va0.a(d02.f7567a, d02.f7568b, d02.f7569c, d02.f7570d, d02.e, d02.f7571f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static x0 c0(a2 a2Var) {
        a2Var.k();
        return new x0(a2Var.p(6), a2Var.p(6), a2Var.p(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.jy0 d0(com.google.android.gms.internal.ads.a2 r18, boolean r19, int r20, com.google.android.gms.internal.ads.jy0 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.p(r2)
            boolean r7 = r0.o()
            r8 = 5
            int r8 = r0.p(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.o()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.p(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f7567a
            boolean r7 = r2.f7568b
            int r8 = r2.f7569c
            int r10 = r2.f7570d
            int[] r4 = r2.e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.p(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.o()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.o()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.m(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.m(r5)
        L79:
            com.google.android.gms.internal.ads.jy0 r11 = new com.google.android.gms.internal.ads.jy0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy.d0(com.google.android.gms.internal.ads.a2, boolean, int, com.google.android.gms.internal.ads.jy0):com.google.android.gms.internal.ads.jy0");
    }

    public static void e0(a2 a2Var) {
        int r8 = a2Var.r() + 1;
        a2Var.m(8);
        for (int i = 0; i < r8; i++) {
            a2Var.r();
            a2Var.r();
            a2Var.k();
        }
        a2Var.m(20);
    }

    public static String f0(mw1 mw1Var) {
        String str;
        String str2 = mw1Var.f8459o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = mw1Var.f8455k) != null) {
            if (!str.startsWith("dva1") && !str.startsWith("dvav")) {
                if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return str2;
    }

    public static int n(String str) {
        int i;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i = length & (-4);
            if (i11 >= i) {
                break;
            }
            int i13 = ((bytes[i11] & 255) | ((bytes[i11 + 1] & 255) << 8) | ((bytes[i11 + 2] & 255) << 16) | (bytes[i11 + 3] << 24)) * (-862048943);
            int i14 = i12 ^ (((i13 >>> 17) | (i13 << 15)) * 461845907);
            i12 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i15 = length & 3;
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    i10 = (bytes[i + 2] & 255) << 16;
                }
                int i16 = i12 ^ length;
                int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
                int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
                return i18 ^ (i18 >>> 16);
            }
            i10 |= (bytes[i + 1] & 255) << 8;
        }
        int i19 = ((bytes[i] & 255) | i10) * (-862048943);
        i12 ^= ((i19 >>> 17) | (i19 << 15)) * 461845907;
        int i162 = i12 ^ length;
        int i172 = (i162 ^ (i162 >>> 16)) * (-2048144789);
        int i182 = (i172 ^ (i172 >>> 13)) * (-1028477387);
        return i182 ^ (i182 >>> 16);
    }

    public static int o(byte[] bArr, int i) {
        int i10;
        synchronized (K) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i) {
                while (true) {
                    try {
                        if (i11 < i - 2) {
                            int i13 = i11 + 1;
                            if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                                break;
                            }
                            i11 = i13;
                        } else {
                            i11 = i;
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i) {
                    int[] iArr = L;
                    int length = iArr.length;
                    if (length <= i12) {
                        L = Arrays.copyOf(iArr, length + length);
                    }
                    L[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = L[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.qb0, java.lang.Object] */
    public static synchronized AudioManager p(Context context) {
        synchronized (xy.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f12658v = null;
                }
                AudioManager audioManager = f12658v;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    ?? obj = new Object();
                    b80.h().execute(new t81(applicationContext, 10, (Object) obj));
                    obj.b();
                    AudioManager audioManager2 = f12658v;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f12658v = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.nx0, java.lang.Object] */
    public static nx0 q(ib.o oVar) {
        ?? obj = new Object();
        obj.B = oVar;
        oVar.c(o81.f9033u, new bl0(7, obj));
        return obj;
    }

    public static g61 r(Set set, j51 j51Var) {
        b80.M(set, "set1");
        b80.M(j51Var, "set2");
        return new g61(set, j51Var);
    }

    public static g9.c3 t(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rp0 rp0Var = (rp0) it.next();
            if (rp0Var.f10271c) {
                arrayList.add(z8.h.i);
            } else {
                arrayList.add(new z8.h(rp0Var.f10269a, rp0Var.f10270b));
            }
        }
        return new g9.c3(context, (z8.h[]) arrayList.toArray(new z8.h[arrayList.size()]));
    }

    public static String u(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (G(optJSONArray2, str) && !G(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static void v(Exception exc, String str) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void w(oa.a aVar, Throwable th, String str) {
        pu.a((Context) oa.b.z1(aVar)).d(th, str, ((Double) fn.f6131f.p()).floatValue());
    }

    public static boolean x(o2 o2Var) {
        xk0 xk0Var = new xk0(8);
        int i = c0.a(o2Var, xk0Var).f4929u;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        o2Var.y(xk0Var.f12580a, 0, 4);
        xk0Var.E(0);
        int b10 = xk0Var.b();
        if (b10 != 1463899717) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 23);
            sb2.append("Unsupported form type: ");
            sb2.append(b10);
            x21.N("WavHeaderReader", sb2.toString());
            return false;
        }
        return true;
    }

    public static boolean y(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static byte[] z(byte[]... bArr) {
        int i = 0;
        int i10 = 0;
        while (true) {
            if (i < bArr.length) {
                int length = bArr[i].length;
                if (i10 <= Integer.MAX_VALUE - length) {
                    i10 += length;
                    i++;
                } else {
                    androidx.datastore.preferences.protobuf.s1.q("exceeded size limit");
                    return null;
                }
            } else {
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length2);
                    i11 += length2;
                }
                return bArr2;
            }
        }
    }

    public static void zza() {
        try {
            if (!lc1.a()) {
            } else {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
        } catch (GeneralSecurityException e) {
            androidx.datastore.preferences.protobuf.s1.r(e);
        }
    }

    public abstract Integer E();

    public abstract Object F();

    public abstract v91 s();

    public String toString() {
        switch (this.f12663u) {
            case 24:
                return F().toString();
            default:
                return super.toString();
        }
    }
}

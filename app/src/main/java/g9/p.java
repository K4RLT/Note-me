package g9;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.yo;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final p f17688g = new p();

    /* renamed from: a, reason: collision with root package name */
    public final l9.d f17689a;

    /* renamed from: b, reason: collision with root package name */
    public final n f17690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17691c;

    /* renamed from: d, reason: collision with root package name */
    public final l9.a f17692d;
    public final Random e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17693f;

    public p() {
        l9.d dVar = new l9.d();
        n nVar = new n(new yo("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new yo("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new yo("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new yo("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new yo("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new yo("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        l9.a aVar = new l9.a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        this.f17689a = dVar;
        this.f17690b = nVar;
        this.f17691c = false;
        this.f17692d = aVar;
        this.e = random;
        this.f17693f = bigInteger;
    }

    public static void a() {
        f17688g.f17691c = false;
    }
}

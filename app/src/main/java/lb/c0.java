package lb;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.ExecutionException;
import wa.h8;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final mb.e f20098a;

    public c0(mb.e eVar) {
        this.f20098a = eVar;
    }

    public final ParcelFileDescriptor.AutoCloseInputStream a(String str, int i, int i10, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) h8.a(((t1) this.f20098a.b()).h(str, i, i10, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new k0("Corrupted ParcelFileDescriptor, session " + i + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i10, i);
        } catch (InterruptedException e) {
            throw new k0("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e8) {
            throw new k0("Error opening chunk file, session " + i + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i10, e8, i);
        }
    }
}

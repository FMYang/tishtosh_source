package org.eclipse.mat.parser.model;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import org.eclipse.mat.snapshot.model.IArray;

public abstract class AbstractArrayImpl extends AbstractObjectImpl implements IArray {
    private static final long serialVersionUID = 2;
    private Object info;
    protected int length;

    public Object getInfo() {
        return this.info;
    }

    public int getLength() {
        return this.length;
    }

    public String getTechnicalName() {
        StringBuilder sb = new StringBuilder(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        String name = getClazz().getName();
        int indexOf = name.indexOf(91);
        if (indexOf < 0) {
            sb.append(name);
        } else {
            int i = indexOf + 1;
            sb.append(name.subSequence(0, i));
            sb.append(getLength());
            sb.append(name.substring(i));
        }
        sb.append(" @ 0x");
        sb.append(Long.toHexString(getObjectAddress()));
        return sb.toString();
    }

    public void setInfo(Object obj) {
        this.info = obj;
    }

    public void setLength(int i) {
        this.length = i;
    }

    /* access modifiers changed from: protected */
    public StringBuffer appendFields(StringBuffer stringBuffer) {
        StringBuffer appendFields = super.appendFields(stringBuffer);
        appendFields.append(";length=");
        appendFields.append(this.length);
        return appendFields;
    }

    public AbstractArrayImpl(int i, long j, ClassImpl classImpl, int i2) {
        super(i, j, classImpl);
        this.length = i2;
    }
}

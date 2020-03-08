package org.intellij.plugins.junitgen.bean;

import com.intellij.psi.PsiField;

/**
 * Created by yy on 2020/3/8.
 */
public class FieldComposite {
    private PsiField field;
    private String fieldName;
    private String fieldType;

    @Override
    public String toString() {
        return "FieldComposite{" +
                "field=" + field +
                ", fieldName='" + fieldName + '\'' +
                ", fieldType='" + fieldType + '\'' +
                '}';
    }

    public PsiField getField() {
        return field;
    }

    public void setField(PsiField field) {
        this.field = field;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }
}

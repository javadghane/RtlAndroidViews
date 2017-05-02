# RtlRadioButton
simple customized radio button with RTL text and icon


# usage:
just put that in your xml file. 

```   
<RtlRadioButton
android:layout_width="wrap_content"
android:layout_height="wrap_content"/> 

```

and initialize the class:
```
RtlRadioButton rd = (RtlRadioButton) findviewbyid(R.id.yourid);
rd.setColor(Color.BLACK);
rd.setText("یک متن فارسی");
rd.setCheck(true);
rd.setClick(new RtlRadioButton.onClick() {
            @Override
            public void click() {
              //Do somthing
            }
        });
``` 


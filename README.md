# UretimPlanlama

# Çok Makineli İş Atama Problemi Çözücüsü

Bu proje, **çok makineli iş atama problemi**ni dinamik programlama kullanarak çözen bir Java uygulamasını içerir. Amaç, birden fazla işi birden fazla makineye atayarak toplam süreyi (işlem süreleri + makineler arası geçiş süreleri) minimize etmektir.

## Problem Tanımı
- **n**: İş sayısı (örneğin, 3 iş).
- **m**: Makine sayısı (örneğin, 3 makine).
- **islemSuresi[i][j]**: İş `i`'nin makine `j`'de işlenmesi için gereken süre.
- **gecisSuresi[j][k]**: Bir iş, makine `j`'den makine `k`'ya geçtiğinde eklenen geçiş süresi.
- **Hedef**: Her işin bir makineye atanmasını öyle bir şekilde yapmak ki toplam süre minimum olsun.
- **Çıktı**: Minimum toplam süre ve her işin hangi makineye atandığını gösteren atama planı.

## Algoritma
Program, dinamik programlama kullanarak aşağıdaki adımları izler:
1. **Başlatma**: İlk işin işlem süreleri doğrudan atanır, çünkü önceki iş olmadığından geçiş süresi yoktur.
2. **Dinamik Programlama**: Her iş için, her makine kombinasyonu denenerek minimum toplam süre hesaplanır. Geçiş süreleri ve işlem süreleri dikkate alınır.
3. **Minimum Süre Bulma**: Son iş için tüm makineler arasında en küçük toplam süre seçilir.
4. **Geri İzleme**: Optimal makine atamaları, önceki makine bilgisi kullanılarak belirlenir.

from collections import defaultdict

# Fungsi untuk membaca file teks


def read_file(file_path):
    with open(file_path, 'r') as file:
        # Baca setiap baris dan pisahkan berdasarkan koma (CSV)
        text_data = [line.strip() for line in file.readlines()]
    return text_data

# Fungsi untuk memetakan kata menjadi pasangan (word, 1)


def map_function(text):
    # Hapus tanda baca seperti koma
    cleaned_text = text.replace(',', '')
    # Pisahkan kata-kata
    words = cleaned_text.split()
    # Buat pasangan (word, 1) untuk setiap kata
    mapped = [(word, 1) for word in words]
    return mapped

# Fungsi untuk menggabungkan jumlah kemunculan setiap kata


def reduce_function(mapped_data):
    word_count = defaultdict(int)
    for word, count in mapped_data:
        word_count[word] += count
    return dict(word_count)


# Path ke file teks
file_path = 'minatmhs.csv'  # Sesuaikan dengan lokasi file Anda

# Membaca data dari file
text_data = read_file(file_path)

# Langkah Map: Memetakan setiap kata ke dalam pasangan (word, 1)
mapped_data = []
for text in text_data:
    mapped_data.extend(map_function(text))

# Langkah Reduce: Menghitung jumlah kemunculan setiap kata
word_count = reduce_function(mapped_data)

# Menampilkan hasil setiap kata dan jumlah kemunculannya
for word, count in word_count.items():
    print(f"{word}: {count}")

# Menampilkan total jumlah kemunculan semua kata
total_count = sum(word_count.values())
print(f"Total jumlah kemunculan semua kata: {total_count}")

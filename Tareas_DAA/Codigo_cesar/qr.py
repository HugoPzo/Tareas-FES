# QR Library -> pip install pyqrcode
import pyqrcode
from pyqrcode import QRCode

# Image Library - > pip install pillow
from PIL import Image

# String which represent the QR code
page = "https://youtube.com"

# Generate QR code
url = pyqrcode.create(page)

# Create 'svg' image
# url.svg("name", scale=num)
url.svg("youtube.svg", scale=8)


# Load an image (only: JPEG, PNG, BMP, GIF, and PPM)
img = Image.open('imagen.jpg')
# Display the image
img.show()